import java.util.ArrayList;
import java.util.List;

public class Curs
{
    private List<Student> studenti = new ArrayList<>();

    public void adauga_student(Student student)
    {
        studenti.add(student);
    }

    public void prezenta()
    {
        System.out.println("Prezenta:");

        for (Student s : studenti)
        {
            System.out.println(s.getNume() + " " + s.status());
        }
        System.out.println("\n");
    }
}
