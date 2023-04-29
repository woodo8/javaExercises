import java.util.Arrays;
public class sixthTask {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int outerCounter = 0;
        int innerCounter = 0;
        int swapCounter = 0;

        for (int i = 0; i < n / 2; i++) {
            int min = i;
            int max = i;
            for (int j = i + 1; j < n - i; j++) {
                innerCounter++;
                if (arr[j] < arr[min]) {
                    min = j;
                } else if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            if (min != i) {
                swapCounter++;
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            if (max == i) {
                max = min;
            }
            if (max != n - i - 1) {
                swapCounter++;
                int temp = arr[n - i - 1];
                arr[n - i - 1] = arr[max];
                arr[max] = temp;
            }
            outerCounter++;
        }

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Total number of actions: " + (outerCounter + innerCounter + swapCounter));
    }
}
