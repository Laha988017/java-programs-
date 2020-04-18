package pkg;

public class Item1 extends Item {
    int z;
    public Item1()
    {
        super();
        z = 0;
    }
    public Item1(int x , int y , int z)
    {
        super(x,y);
        this.z = z;
    }
    public void setZ(int z)
    {
        this.z = z;
    }
    public int getZ()
    {
        return z;
    }
}