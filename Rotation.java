import java.util.Scanner;
class Rotation 
{
    void leftRotation(int arr[], int k, int n)
    {
        for (int i = 0; i < k; i++)
            leftRotatebyOne(arr, n);
    }
 
    void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args)
    {
        Rotation r = new Rotation();
        int arr[] = new int[50];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        n = sc.nextInt();
        System.out.println("Enter the "+n+" Elements: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
       System.out.println("Enter the No. of Elements you want to Rotate: ");
       int k = sc.nextInt();
       r.leftRotation(arr, k, n);
       r.printArray(arr, n);
    }
}
 