import java.util.Random;
import java.util.Arrays;

public class secondTask {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        // Fill the array with random numbers from 1 to 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Array: " + Arrays.toString(array));

        // Find the smallest and largest elements of the array
        int smallest = array[0];
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Print the smallest and largest elements of the array
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}
