public class Main {
    public static void main(String[] args)
    {
        creator Creator = new creator_student();
        om Om = Creator.creare();
        Om.definire_statut();

        Creator = new creator_profesor();
        Om = Creator.creare();
        Om.definire_statut();
    }
}