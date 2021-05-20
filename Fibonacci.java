import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        int n;
        int a = 0;
        int b = 1;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of Series: ");
        n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i< n; i++)
        {

            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }    
}
