public class Adaptor
{
    public static C3Nr toC3Nr(C2Nr a)
    {
        return new C3Nr(a.getX(), a.getY(), 0);
    }

    public static C2Nr toC2Nr(C3Nr a)
    {
        return new C2Nr(a.getX(), a.getY());
    }
}
