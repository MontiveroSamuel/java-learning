import java.util.Scanner;

public class Palindrome {
    public static boolean palindrome(String text) {
        // write your code here
        StringBuilder result = new StringBuilder();

        for (int i = text.length() -1; i >= 0; i--) {
            result.append(text.charAt(i));
        }
        return result.toString().equals(text);

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
