import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Create an array with values 10 to 1
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = 10 - i;
        }

        // Print the unsorted array
        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(array));

        System.out.println(); // Print a newline

        // Sort the array using the bubble sort algorithm
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}