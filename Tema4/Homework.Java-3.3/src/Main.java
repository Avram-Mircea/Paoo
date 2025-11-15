import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Cerc cerc = new Cerc(3);
        Dreptungi dreptunghi = new Dreptungi(4, 5);

        List<Forma> figuri = Arrays.asList(cerc, dreptunghi);

        double suma = Calculator_suma_arii.calculare(figuri);
        System.out.println("Suma ariilor este: " + suma);
    }
}