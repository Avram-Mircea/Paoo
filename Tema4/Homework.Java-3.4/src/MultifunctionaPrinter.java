public class MultifunctionaPrinter implements Printer, Scaner, Fax
{
    @Override
    public void print()
    {
        System.out.println("Printez");
    }

    @Override
    public void scan()
    {
        System.out.println("Scanez");
    }

    @Override
    public void fax()
    {
        System.out.println("Trimit prin fax");
    }
}
