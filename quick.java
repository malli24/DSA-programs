public class quick {
    public static void quicksort(int[] arr, int l, int r) {
        if (l < r) {
            int pi = partition(arr, l, r);
            quicksort(arr, l, pi - 1);
            quicksort(arr, pi + 1, r);
        }
    }
    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[l];
        int low = l + 1;
        int high = r;

        while (low <= high) {
            while (low <= high && arr[low] <= pivot) {
                low++;
            }
            while (low <= high && arr[high] > pivot) {
                high--;
            }

            if (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[high];
        arr[high] = temp;
        return high;
    }
    public static void main(String args[]) {
        int[] arr = {4, 6, 8, 3, 5, 7, 9, 12, 45, 2};

        quicksort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
