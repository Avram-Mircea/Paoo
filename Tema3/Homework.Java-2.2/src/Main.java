public class Main {
    public static void main(String[] args)
    {
        WebHelper helper = WebHelper.getInstance();

        // Prima apelare (va încărca de pe web)
        System.out.println("Prima apelare:");
        System.out.println(helper.getWebSiteContent());

        // A doua apelare (returnează din cache)
        System.out.println("\nA doua apelare:");
        System.out.println(helper.getWebSiteContent());
    }
}