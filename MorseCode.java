import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = "";
        String translate = "";
        boolean valid = false;

        String letter[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };

        String code[] = { "*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**", "*---", "-*-", "*-**",
                "--", "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**" };

        System.out.println("-".repeat(25) + "[ Input ]" + "-".repeat(25));
        do {
            valid = true;
            try {
                System.out.print("\nType your word here separated by - dash: ");
                word = scan.next().toLowerCase();
                String wordSplit[] = word.split("-");

                for (int i = 0; i < wordSplit.length; i++) {
                    for (int j = 0; j < letter.length; j++) {
                        if (wordSplit[i].equals(letter[j])) {
                            translate += code[j] + "|";
                            valid = false;
                        }
                    }
                }
                if (valid) {
                    System.out.println("Invalid Input");
                    valid = true;
                }
            } catch (Exception e) {
                System.out.println("Invalid Input!");
                valid = true;
            }

        } while (valid);
        System.out.println("\n" + "-".repeat(25) + "[ Output ]" + "-".repeat(24));
        System.out.println("\n" + translate);
    }
}
