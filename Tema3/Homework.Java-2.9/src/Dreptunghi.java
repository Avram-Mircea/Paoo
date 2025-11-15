public class Dreptunghi implements Forma
{
    private int lungime;
    private int latime;

    public Dreptunghi(int lungime, int latime)
    {
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    public void arie()
    {
        System.out.println("Aria este : " + lungime * latime);
    }
}
