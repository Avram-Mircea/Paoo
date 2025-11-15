import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Forma cerc = new Cerc(3);
        Forma patrat = new Patrat(4);
        Forma dreptunghi = new Dreptunghi(5, 2);

        Calculator_arii calculatorArii = new Calculator_arii(Arrays.asList(cerc, patrat, dreptunghi));
        System.out.println("Suma arii este: " + calculatorArii.sum_arii());
    }
}