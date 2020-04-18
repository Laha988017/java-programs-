//Default access

package pkg;

public class Test1 {
    public static void main(String[] args) {
        Item item = new Item(5,10);
        System.out.println("X ="+item.getX());
        System.out.println("Y ="+item.getY());
    }
}