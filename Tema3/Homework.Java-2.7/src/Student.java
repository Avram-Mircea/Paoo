import java.util.Random;

public class Student
{
    private String nume;
    private Random random = new Random();

    public Student(String nume)
    {
        this.nume = nume;
    }

    public String getNume()
    {
        return nume;
    }

    public String status()
    {
        return random.nextBoolean() ? "Prezent" : "Absent";
    }
}
