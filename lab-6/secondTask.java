import java.util.Arrays;

public class secondTask {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int n = array.length;
        int outerCounter = 0;
        int innerCounter = 0;
        int ifCounter = 0;

        for (int i = 0; i < n - 1; i++) {
            outerCounter++;
            for (int j = 0; j < n - i - 1; j++) {
                innerCounter++;
                if (array[j] > array[j + 1]) {
                    ifCounter++;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(array));
        System.out.println("Total number of actions: " + (outerCounter + innerCounter + ifCounter));
    }
}
