public class Cerc implements Forma
{
    private int raza;

    public Cerc(int raza)
    {
        this.raza = raza;
    }

    @Override
    public void arie()
    {
        System.out.println("Aria este : " + raza * raza * 3.14);
    }
}
