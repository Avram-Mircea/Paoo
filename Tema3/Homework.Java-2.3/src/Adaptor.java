public class Adaptor
{
    public static Complex toComplex(double x)
    {
        return new Complex(x,0);
    }

    public static double toDouble(Complex x)
    {
        return x.modul();
    }

    public static Complex sum(Complex x, Complex y)
    {
        return x.add(y);
    }

    public static Complex sum(double x, double y)
    {
        Complex a = toComplex(x);
        Complex b = toComplex(y);
        return a.add(b);
    }

    public static Complex sum(Complex x, double y)
    {
        double a = toDouble(x);
        return toComplex(a + y);
    }

    public static Complex sum(double x, Complex y)
    {
        double a = toDouble(y);
        return toComplex(a + x);
    }
}
