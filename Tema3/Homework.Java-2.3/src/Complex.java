public class Complex
{
    private final double real;
    private final double img;

    public Complex(double real, double img)
    {
        this.real = real;
        this.img = img;
    }

    public Complex add(Complex x)
    {
        return new Complex(this.real + x.real, this.img + x.img);
    }

    public double modul()
    {
        return Math.sqrt(real * real + img * img);
    }

    @Override
    public String toString()
    {
        return "real: " + real + " imaginar: " + img;
    }
}
