import java.util.Arrays;
import java.util.Scanner;

public class exam{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) A[i] = scanner.nextInt();
        for (int i = 0; i < n; i++) B[i] = scanner.nextInt();

        Arrays.sort(A);
        Arrays.sort(B);

        System.out.println(findMedian(A, B));
    }

    public static double findMedian(int[] A, int[] B) {
        int n = A.length;

        int low = 0, high = n;

        while (low <= high) {
            int partitionA = (low + high) / 2;
            int partitionB = n - partitionA;

            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : A[partitionA - 1];
            int minRightA = (partitionA == n) ? Integer.MAX_VALUE : A[partitionA];

            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : B[partitionB - 1];
            int minRightB = (partitionB == n) ? Integer.MAX_VALUE : B[partitionB];

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
            } 
            else if (maxLeftA > minRightB) {
                high = partitionA - 1;
            } 
            else {
                low = partitionA + 1;
            }
        }

        return -1;  // should never reach here
    }
}
