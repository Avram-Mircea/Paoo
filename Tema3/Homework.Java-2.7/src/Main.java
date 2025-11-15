public class Main {
    public static void main(String[] args)
    {
        Curs curs = new Curs();

        curs.adauga_student(new Student("Ana"));
        curs.adauga_student(new Student("Dan"));
        curs.adauga_student(new Student("Marian"));

        curs.prezenta();
        curs.prezenta();
        curs.prezenta();
    }
}