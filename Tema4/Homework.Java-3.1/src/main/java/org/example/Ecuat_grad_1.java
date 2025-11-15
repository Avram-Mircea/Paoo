package org.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Ecuat_grad_1
{
    private double a;
    private double b;

    public Ecuat_grad_1(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public Solutie rezolva()
    {
        if (a != 0)
        {
            double x = -b / a;
            return new Solutie("solutie_unica", x, null);
        } else if (b == 0) {
            return new Solutie("infinit_solutii", null, "Toate valorile reale sunt soluții.");
        } else {
            return new Solutie("nicio_solutie", null, "Ecuația nu are soluții reale.");
        }
    }

    public void salveazaInJson(String filename) {
        Solutie solutie = rezolva();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(solutie, writer);
            System.out.println("Rezultatul a fost salvat în " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class Solutie {
        private String tip;
        private Double solutie;
        private String mesaj;

        public Solutie(String tip, Double solutie, String mesaj) {
            this.tip = tip;
            this.solutie = solutie;
            this.mesaj = mesaj;
        }
    }
}