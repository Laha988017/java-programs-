import java.util.Scanner;
import java.lang.Math;
/*
1.	Write a Java method to compute the future investment value at a given interest rate for a specified number of year.
Sample data (Monthly compounded) and Output:
Input the investment amount: 1000
Input the rate of interest: 10
Input number of years: 5
Expected Output:
Years    FutureValue                                     
1            1104.71                                     
2            1220.39                                     
3            1348.18                                     
4            1489.35                                     
5            1645.31

*/
public class ProdCh2Ex1{
    public static void main(String[] args) {
        double amount,rate,years;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the investment amount: ");
        amount = sc.nextDouble();
        System.out.print("Input the rate of interest: ");
        rate = sc.nextDouble();
        System.out.print("Input number of years: "); 
        years = sc.nextDouble();

        calCI(amount,rate,years);
    }
    public static void calCI(double amount,double rate, double years){
        double amt;
        System.out.println("Year\tFutureValue");
        for(int i=1;i<=years;i++)
        {
            amt = amount*Math.pow(1+(rate/1200), 12*i );
            System.out.println(i+"\t"+String.format("%.2f", amt));
        }
    } 
}