import java.util.Arrays;
public class thirdTask {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int actions = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                actions++; // increment action counter for each comparison
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                    actions++; // increment action counter for each swap
                }
            }
            if (isSorted) {
                break; // exit outer loop if array is already sorted
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Total actions: " + actions);
    }
}
