public class Main {
    public static void main(String[] args)
    {
        Print print = new Print();
        print.print();

        System.out.println();

        MultifunctionaPrinter multifunctionaPrinter = new MultifunctionaPrinter();
        multifunctionaPrinter.print();
        multifunctionaPrinter.scan();
        multifunctionaPrinter.fax();
    }
}