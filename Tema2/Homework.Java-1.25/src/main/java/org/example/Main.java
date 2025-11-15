package org.example;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String url = "https://www.ucv.ro/";

        try {
            Document document = Jsoup.connect(url).get();

            Elements stiriSection = document.select("strong");

            if (!stiriSection.isEmpty()) {
                Element primulTitlu = stiriSection.getFirst();
                if (primulTitlu != null) {
                    System.out.println("Primul titlu din stiri: " + primulTitlu.text());
                } else {
                    System.out.println("Nu am gasit un titlu de stire.");
                }
            } else {
                System.out.println("Nu am gasit secțiunea de stiri.");
            }

        } catch (IOException e) {
            System.err.println("A aparut o eroare la incarcarea paginii: " + e.getMessage());
        }
    }
}
