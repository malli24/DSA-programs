import java.util.Scanner;
public class Sumofn {
    public static int calculateSum(int[] arr) { 
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        int result = calculateSum(numbers);

        System.out.println("The sum of the numbers is: " + result);
    }
}