import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
    String nume;
    float nota;

    Student(String num, float not)
    {
        nume = num;
        nota = not;
    }

    @Override
    public String toString()
    {
        return "Nume: " + nume + ", nota: " + nota;
    }

    public float getNota()
    {
        return nota;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> lista_studenti = new ArrayList<>();
        lista_studenti.add(new Student("Andrei", 7.8f));
        lista_studenti.add(new Student("Maria", 9.3f));
        lista_studenti.add(new Student("Alex", 5.9f));

        System.out.println("Lista studenti nesortata:\n" + lista_studenti);

        Collections.sort(lista_studenti, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Float.compare(s1.getNota(), s2.getNota());
            }
        });

        System.out.println("\nLista de studenți sortata după nota:\n" + lista_studenti);
    }
}