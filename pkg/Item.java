package pkg;
class Item
{
    int x,y;
    protected Item()
    {
        x = 0;
        y = 0;
    }
    protected Item(int x , int y)
    {
        this.x = x;
        this.y = y;
    }
    protected void setX(int x)
    {
        this.x = x;
    }
    protected void setY(int y)
    {
        this.y = y;
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