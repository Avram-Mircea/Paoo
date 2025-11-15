public class Main {
    public static void main(String[] args)
    {
        Student student = new Student("Ana", 10, 9);

        Calcul_medie calculMedie = new Calcul_medie();
        float media = calculMedie.media(student);

        Situatie_student situatieStudent = new Situatie_student();
        situatieStudent.situatie(student, media);
    }
}