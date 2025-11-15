import java.util.List;

public class Calculator_arii
{
    private List<Forma> forme;

    public Calculator_arii(List<Forma> forme)
    {
        this.forme = forme;
    }

    public double sum_arii()
    {
        double s = 0;

        for (Forma figura : forme)
            s += figura.arie();

        return s;
    }
}
