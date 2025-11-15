public class FormaFactory
{
    public static Forma creare_figura(int... parametri)
    {
        if (parametri.length == 1)
            return new Cerc(parametri[0]);
        else if (parametri.length == 2)
            return new Dreptunghi(parametri[0], parametri[1]);
        else
            throw new IllegalArgumentException("Numarul de parametri nu este valid.");
    }
}
