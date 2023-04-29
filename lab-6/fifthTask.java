import java.util.Arrays;
public class fifthTask {
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,3,2,1};
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(array));
        int n = array.length;
        int outerCounter = 0;
        int innerCounter = 0;
        int ifCounter = 0;

        for (int i = 0; i < n - 1; i++) {
            outerCounter++;
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                innerCounter++;
                if (array[j] < array[minIndex]) {
                    ifCounter++;
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(array));
        System.out.println("Total number of actions: " + (outerCounter + innerCounter + ifCounter));
    }
}
