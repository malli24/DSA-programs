public class insertion{
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        int i = 1;
        while (i < n) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            i++;
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 7, 6};
        System.out.println("Before sorting:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }
}
