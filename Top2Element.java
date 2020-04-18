import java.util.*;
public class Top2Element {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        a = sort(a);
        System.out.println("Top 2 elements are: "+ a[a.length-1]+" "+ a[a.length-2]);
    }
    public static int[] sort(int a[]) {
        Arrays.sort(a);
        return a; 
    }
}