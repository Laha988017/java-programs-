
abstract class A
{
public A()
{
System.out.println("This is constructor of abstract class");
}
abstract public void a_method();
public void non_a_method()
{
System.out.println("This is a normal method of abstract class");
}
}
class SubClass extends A
{
public void a_method()
{
System.out.println("This is abstract method");
}
}
class AbstractAssignment2
{
public static void main(String []args)
{
SubClass sc=new SubClass();
sc.a_method();
sc.non_a_method();
}
}
