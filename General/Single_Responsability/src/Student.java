public class Student
{
    private String nume;
    private int nota1, nota2;

    public Student(String nume, int nota1, int nota2)
    {
        this.nume = nume;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNume()
    {
        return nume;
    }

    public int getNota1()
    {
        return nota1;
    }

    public int getNota2()
    {
        return nota2;
    }
}
