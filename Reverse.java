import java.util.Scanner;
public class ReverseArray
{
    public static void main(String[] args)
    {
        int []arr = new int[50];   //declaration and instantiation  
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        n = sc.nextInt();
        System.out.println("Enter the "+n+" Elements in The Array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array is: ");
        for(int i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("The Reverse Array is: ");
        for(int i = n - 1; i >= 0; i--)
        {
            System.out.println(arr[i]);
        }
    }    
}
