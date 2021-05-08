import java.util.Scanner;
public class Sumofarray
{
    public static void main(String[] args)
    {
        int n;
        int sum = 0;  //Assign Sum = 0
        int []arr = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Aray: ");
        n = sc.nextInt();
        System.out.println("Enter the "+n+" Elements: ");
        for(int i = 0; i< n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array is: ");
        for(int i =0; i < n;  i++)
        {
            sum += arr[i];      //Sum = sum + arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("The sum is: "+sum);
    }    
}
