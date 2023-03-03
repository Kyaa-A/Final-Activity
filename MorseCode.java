import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {

        String alphabet[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };

        String morseCode[] = { "*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**", "*---", "-*-", "*-**",
                "--", "-*", "---", "*--*", "--*-", "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**" };

        Scanner scan = new Scanner(System.in);

        System.out.print("Type your word here separated by -dash:\t");
        String input = scan.nextLine().toLowerCase();

        String inputSplit[] = input.split("-");
        
        for (int i = 0; i < inputSplit.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if(inputSplit[i].equals(alphabet[i])){
                    
                }
            }
        }

    }
}
