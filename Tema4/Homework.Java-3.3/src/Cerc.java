public class Cerc implements Forma
{
    private double raza;

    public Cerc(double raza)
    {
        this.raza = raza;
    }

    @Override
    public double arie()
    {
        return 3.14 * raza * raza;
    }
}
