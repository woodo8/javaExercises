import java.util.Scanner;

public class fifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read in the word from the user and convert it to lowercase
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        // Check if the word is a palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        // Print the result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}