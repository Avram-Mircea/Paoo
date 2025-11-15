public class Main {
    public static void main(String[] args)
    {
        Prelungitor prelungitor = new Prelungitor();

        prelungitor.adauga_aparat(new Aparat_de_cafea());
        prelungitor.adauga_aparat(new Frigider());

        prelungitor.baga_in_priza();
        System.out.print("\n");
        prelungitor.scoate_din_priza();
    }
}