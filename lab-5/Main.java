import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] array = new int[10];

        // Fill the array with numbers from 9 to 0
        for (int i = 0; i < array.length; i++) {
            array[i] = 9 - i;
        }
        System.out.println("_____Task 1-start_____");
        System.out.println("Array: " + Arrays.toString(array));
        // Display the values of the array using a for-each loop
        for (int value : array) {
            System.out.println(value);
        }
        System.out.println("_____Task 1-end_____");
    }

}