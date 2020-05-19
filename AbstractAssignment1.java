abstract class Marks
{
public abstract double getPercentage();
}
class A extends Marks
{
private int marks1,marks2,marks3;
public A(int a,int b,int c){marks1=a;marks2=b;marks3=c;}
public double getPercentage()
{
return (marks1+marks2+marks3)/3;
}
}
class B extends Marks
{
private int marks1,marks2,marks3,marks4;
public B(int a,int b,int c,int d){marks1=a;marks2=b;marks3=c;marks4=d;}
public double getPercentage()
{
return (marks1+marks2+marks3+marks4)/4;
}
}
class AbstractAssignment1
{
public static void main(String []args)
{
Marks a = new A(78,89,67);
Marks b = new B(94,76,54,82);
System.out.println("A percentage: "+a.getPercentage()+"%\nB percentage: "+b.getPercentage()+"%");
}
}