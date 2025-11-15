import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float numar1;
        float numar2;

        try {
            System.out.print("Introduceți primul număr: ");
            numar1 = scanner.nextFloat();

            System.out.print("Introduceți al doilea număr: ");
            numar2 = scanner.nextFloat();

            float suma = numar1 + numar2;
            System.out.println("Suma este: " + suma);
        } catch (InputMismatchException e) {
            System.out.println("Eroare: Ați introdus un tip de date invalid. Vă rugăm să introduceți numere.");
        } catch (NullPointerException e) {
            System.out.println("Eroare: Unele dintre numere sunt nule. Vă rugăm să introduceți valori valide.");
        } finally {
            // Închidem scannerul pentru a preveni scurgerile de memorie
            scanner.close();
        }
    }
}
