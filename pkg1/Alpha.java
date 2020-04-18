package pkg1;
import pkg.*;
public class Alpha extends Item1{
    Alpha()
    {
        super();
    }
    Alpha(int x, int y , int z)
    {
        super(x,y,z);
    }
    public static void main(String[] args) {
        Item1 item = new Item1(5,10,15);
        System.out.println("X = "+item.getX());
        System.out.println("Y = "+item.getY());
        System.out.println("Z = "+item.getZ());
    }
}