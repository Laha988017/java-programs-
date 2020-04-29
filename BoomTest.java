/*
2.	Seven Boom!
Create a function that takes an array of numbers and return "Boom!" if the number 7 appears in the array. Otherwise, return "there is no 7 in the array".
Examples
sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"

sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"

sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
*/
import java.util.Scanner;
public class BoomTest {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(sevenBoom(arr));
    }
    public static String sevenBoom(int arr[]) {
        for(int i=0;i<arr.length;i++)
        {
           if(checkseven(arr[i]))
           {
               return "BOOM!";
           }
        }
            return "there is no 7 in the array";
    }
    public static boolean checkseven(int n) {
        while(n!=0)
        {
            int rem = n%10;
            if(rem == 7)
                return true;
            n/=10;
        }
        return false;
    }
}