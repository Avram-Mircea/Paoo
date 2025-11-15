import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String nume_fisier = "Numere.txt";

        try {
            System.out.print("Suma este: " + calculeaza_suma_int(nume_fisier));
        } catch (FileNotFoundException e) {
            System.out.println("Nu exista fisierul!");
        } catch (IOException e) {
            System.out.println("A aparut o eroare la citirea fisierului!");
        }
    }

    static int calculeaza_suma_int(String nume_fisier) throws IOException
    {
        int suma = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nume_fisier))) {
            String linie;

            while ((linie = br.readLine()) != null) {
                try {
                    int numarIntreg = Integer.parseInt(linie);
                    suma += numarIntreg;
                } catch (NumberFormatException e) {
                    //o implementare pt float sau caractere
                }
            }
        }
        return suma;
    }
}