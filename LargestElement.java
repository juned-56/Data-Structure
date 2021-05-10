import java .io.*;
import java.util.*;
 
class LargestElement
{
    static int largest(int []arr,  int n)
    {
        Arrays.sort(arr);
        return arr[n - 1];
    }
     static public void main (String[] args)
    {
        int arr[] = new int[50];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();
        System.out.println("Enter the "+n+" Elements in Array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        n = arr.length;
        System.out.println("The Largest Element is: "+largest(arr, n));
    }
}
 
