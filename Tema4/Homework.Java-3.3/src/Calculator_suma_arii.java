import java.util.List;

public class Calculator_suma_arii
{
    public static double calculare(List<Forma> figuri)
    {
        double suma = 0;

        for (Forma figura : figuri)
            suma += figura.arie();

        return suma;
    }
}
