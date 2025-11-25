import java.util.Scanner;

public class tailrecursion {

    // Tail recursive helper method
    public static long factorialHelper(int n, long acc) {
        if (n == 0 || n == 1) {
            return acc;  // base case
        }
        return factorialHelper(n - 1, n * acc);  // recursive call is last operation
    }

    // Main factorial method
    public static long factorial(int n) {
        return factorialHelper(n, 1);  // initial accumulator = 1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}