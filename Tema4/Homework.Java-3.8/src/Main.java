import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Forma cerc = new Cerc();
        Forma dreptunghi = new Dreptunghi();

        Desenator desenator = new Desenator(Arrays.asList(cerc, dreptunghi));
        desenator.deseneaza_figuri();
    }
}