import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int vowel = 0;
        int consonant = 0;

        try {
            System.out.print("[!] Enter a text: ");
            String input = scan.nextLine().toLowerCase().replaceAll("[\\s+ \\W+]", "");

            for (int i = 0; i < input.length(); i++) {
                char l = input.charAt(i);
                if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
                    vowel++;
                } else if (l >= 'a' && l <= 'z') {
                    consonant++;
                }
            }
        } catch (Exception e) {
            System.out.println("[!] Invalid, Please Try Again...");
        }
        System.out.println(vowel + " vowels and " + consonant + " consonants");
    }
}