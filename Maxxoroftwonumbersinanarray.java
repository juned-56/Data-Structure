import java.util.*;
import java.io.*;
class Maxxor
{
    static int maxxor(int arr[], int n)
    {
        int Mxor = 0;
        for(int i = 0; i < n; i++)  //Calculating Xor of eahc pair
        {
            for(int j = i + 1; j < n; j++)
            {
                Mxor = Math.max(Mxor, arr[i] ^ arr[j]);
            }
        }
        return Mxor;

    }
public static void main(String[] args)
{   
    int n;
    int arr[] = new int[50];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of Array: ");
    n = sc.nextInt();
    System.out.println("enter the "+n+" Elements: ");
    for(int i = 0; i < n; i++)
    {
        arr[i] = sc.nextInt();
    }
    System.out.println(maxxor(arr, n));
    
}
    
}
