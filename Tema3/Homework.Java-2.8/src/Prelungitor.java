import java.util.ArrayList;
import java.util.List;

public class Prelungitor
{
    private List<Aparat> aparate = new ArrayList<>();
    private boolean este_oprit = true;

    public void adauga_aparat(Aparat aparat)
    {
        aparate.add(aparat);
    }

    public void baga_in_priza()
    {
        if(este_oprit)
        {
            este_oprit = false;
            for (Aparat aparat : aparate)
                aparat.pornit();
        }
    }

    public void scoate_din_priza()
    {
        if(!este_oprit)
        {
            este_oprit = true;
            for (Aparat aparat : aparate)
                aparat.oprit();
        }
    }
}
