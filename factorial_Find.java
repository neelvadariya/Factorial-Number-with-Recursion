import java.util.Scanner;

public class factorial_Find {

    //function defining
    public static int factorialFinding(int n)
    {
        int result = 0;
        //1. base case condition
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            // recursive function calling
            result = n * factorialFinding(n-1);
        }
        return result;
    }
    
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int result = factorialFinding(n);
        System.out.println("Factorial of given number is : " + result);
    }
}


