public class Dreptungi implements Forma
{
    private double latime;
    private double lungime;

    public Dreptungi(double latime, double lungime)
    {
        this.latime = latime;
        this.lungime = lungime;
    }

    @Override
    public double arie()
    {
        return latime * lungime;
    }
}
