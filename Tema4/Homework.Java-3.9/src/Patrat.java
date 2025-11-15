public class Patrat implements Forma
{
    private double latura;

    public Patrat(double latura)
    {
        this.latura = latura;
    }

    @Override
    public double arie()
    {
        return latura * latura;
    }
}
