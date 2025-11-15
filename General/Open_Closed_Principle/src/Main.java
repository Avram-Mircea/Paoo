public class Main {
    public static void main(String[] args)
    {
        Vehicul masina = new Masina();
        Vehicul motocicleta = new Motocicleta();

        Pornire_vehicul pornireVehicul = new Pornire_vehicul();
        pornireVehicul.pornire_motor(masina);
        pornireVehicul.pornire_motor(motocicleta);
    }
}