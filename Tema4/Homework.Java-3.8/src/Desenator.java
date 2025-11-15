import java.util.List;

public class Desenator
{
    private List<Forma> figuri;

    public Desenator(List<Forma> figuri)
    {
        this.figuri = figuri;
    }

    public void deseneaza_figuri()
    {
        for (Forma figura : figuri)
            figura.desenez();
    }
}
