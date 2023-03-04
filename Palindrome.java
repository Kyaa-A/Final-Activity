import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String reverseStr = "";

        System.out.println("This program will tell you whether the text is Palindrome or Not Palindrome\n");

        try {
            System.out.print("[!]Enter texts:\t");
            String word = scan.nextLine().replaceAll("[\\s+ \\W+]", "");

            for (int i = word.length() - 1; i >= 0; i--) {
                reverseStr += word.charAt(i);
            }

            if (word.toLowerCase().equals(reverseStr.toLowerCase())) {
                System.out.println("\n[!]Output:\t" + word + " is a Palindrome");
            } else {
                System.out.println("\n[!]Output:\t" + word + " is not Palindrome");
            }
        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }

    }
}