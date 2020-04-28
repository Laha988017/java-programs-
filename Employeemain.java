class Member
{
    String name;
    String address;
    int age;
    int phone;
    Double salary;
    void printSalary()
    {
        System.out.println("Salary is: "+salary);
    }
}
class Employee extends Member
{
    String spec;
}
class Manager extends Member
{
    String dept;
}
public class Employeemain {

}