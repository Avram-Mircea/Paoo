public class Dreptunghi implements Forma
{
    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime)
    {
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    public double arie()
    {
        return lungime * latime;
    }
}
