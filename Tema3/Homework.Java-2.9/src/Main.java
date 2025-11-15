public class Main {
    public static void main(String[] args)
    {
        Forma cerc = FormaFactory.creare_figura(3);
        cerc.arie();

        Forma dreptunghi = FormaFactory.creare_figura(3, 4);
        dreptunghi.arie();
    }
}