import java.util.Scanner;
public class fourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read in two strings from the user
        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();

        // Concatenate the two strings
        String concatenated = first.concat(second).concat(second).concat(first);

        // Check if the resulting string is alternating
        boolean isAlternating = true;
        for (int i = 0; i < concatenated.length() - 1; i++) {
            if (concatenated.charAt(i) == concatenated.charAt(i + 1)) {
                isAlternating = false;
                break;
            }
        }

        // Print the result
        System.out.println("Concatenated string: " + concatenated);
        if (isAlternating) {
            System.out.println("The concatenated string is alternating.");
        } else {
            System.out.println("The concatenated string is not alternating.");
        }
    }

}
