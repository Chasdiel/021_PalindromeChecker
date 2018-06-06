import java.util.Scanner;

/*
It' a very simple programme that checks if a sentence written in console is a palindrome
 */
public class PalindromeChecker {

    public static boolean palindrome(String text) {
        int howLong = text.length()-1;
        String help = "";
        while ( howLong >=0 ) {
            help = help + text.charAt(howLong);
            howLong--;
        }
        System.out.println(help);
        if (help.equals(text)) {
            return true;
        }
        return false;
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

