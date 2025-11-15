public class C3Nr
{
    private final int x;
    private final int y;
    private final int z;

    public C3Nr(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getSum()
    {
        return x + y + z;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}
