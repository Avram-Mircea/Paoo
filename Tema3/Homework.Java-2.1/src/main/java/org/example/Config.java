package org.example;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Config
{
    private static Config instance;
    private String color;
    private int weight;
    private boolean loaded = false;

    // Constructor privat
    private Config() {}

    // Singleton getter
    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    private void loadConfig() {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("config.json")) {
            JSONObject json = (JSONObject) parser.parse(reader);
            this.color = (String) json.getOrDefault("color", "#000000");
            this.weight = ((Long) json.getOrDefault("weight", 0L)).intValue();
            this.loaded = true;
        } catch (IOException | ParseException e) {
            throw new RuntimeException("Eroare la citirea fișierului de configurare: " + e.getMessage());
        }
    }

    public String getColor() {
        if (!loaded) {
            loadConfig();
        }
        return color;
    }

    public int getWeight() {
        if (!loaded) {
            loadConfig();
        }
        return weight;
    }
}
