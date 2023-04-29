import java.util.Arrays;
public class seventhTask {
    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(array));
        int n = array.length;
        quickSort(array, 0, n - 1);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(array));
    }
}
