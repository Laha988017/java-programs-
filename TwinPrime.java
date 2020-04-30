/*
3.	Write a Java method to find all twin prime numbers less than 100.
Expected Output:
(3, 5)                                                   
(5, 7)                                                   
(11, 13)                                                 
(17, 19)                                                 
(29, 31)                                                 
(41, 43)                                                 
(59, 61)                                                 
(71, 73) 
*/
import java.util.*;
class TwinPrime
{
	public static void main(String []args)
	{
		System.out.print("Enter the end range: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Twin prime numbers: ");
		generateTwinPrimes(n);
	}
	public static void generateTwinPrimes(int n)
	{
		int now=2;
		int prev=2;
		int i;
		for(int j=3;j<n;j++)
		{
			for(i=2;i<=j/2;i++)
			{
				if(j%i==0)
					break;
			}
			if(i>j/2)
				{
					prev=now;
					now=j;
					if(Math.abs(prev-now)==2)
						System.out.println("("+prev+","+now+")");
				}
		}

	}
}
