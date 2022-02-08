import java.io.*;
import java.util.*;
class Problem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
       int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the "+n+" Values: ");
        for(int i  = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();

        }
        System.out.println("The array is: ");
        for(int i  = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Maximum subarray sum is: "+maxSubArraySum(arr));
    }
    static int maxSubArraySum(int arr[])
    {
        int size = arr.length;
        int max = Integer.MIN_VALUE, max_end = 0;
        for(int i = 0; i < size; i++)
        {
            max_end = max_end + arr[i];
            if(max < max_end)
            max = max_end;
        if(max_end < 0)
        max_end = 0;

        }
        return max;
    }
}
