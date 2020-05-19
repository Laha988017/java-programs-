
abstract class Animals
{
abstract public void cats();
abstract public void dogs();
}
class Cats extends Animals
{
public void cats()
{
System.out.println("Cats meow");
}
public void dogs(){}
}
class Dogs extends Animals
{
public void dogs()
{
System.out.println("Dogs bark");
}
public void cats(){}
}
class AbstractAssignment3
{
public static void main(String []args)
{
Animals c = new Cats();
Animals d = new Dogs();
c.cats();
d.dogs();
}
}
