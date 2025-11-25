import java.util.Scanner;

public class productofn {

    // Recursive method to calculate product
    public static int product(int[] arr, int n) {
        // Base case
        if (n == 0) {
            return 1;  // multiplicative identity
        }
        // Recursive case
        return arr[n - 1] * product(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // Input numbers
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Call recursive method
        int result = product(numbers, n);

        System.out.println("The product of the numbers is: " + result);
    }
}