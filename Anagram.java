import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input1 = "";
        String input2 = "";
        boolean output = true;
        boolean valid = false;
        do {
            valid = true;
            try {
                System.out.println("--------[ Sample Input ]--------\n");
                System.out.print("Enter any number/word:\t");
                input1 = scan.nextLine().replaceAll("[-., ]", "");
                System.out.print("Enter any number/word:\t");
                input2 = scan.nextLine().replaceAll("[-., ]", "");

                String firstInput = input1.toLowerCase();
                String secondInput = input2.toLowerCase();

                char container1[] = firstInput.toCharArray();
                char container2[] = secondInput.toCharArray();

                Arrays.sort(container1);
                Arrays.sort(container2);

                output = Arrays.equals(container1, container2);

                if (input1.length() > 20 || input2.length() > 20) {
                    System.out.println("20 characters are only allowed, Please Try Again...\n");
                    valid = true;
                }
                if (container1.length == container2.length) {
                    valid = false;
                }
            } catch (Exception e) {
                System.out.println("Invalid");
                valid = true;
            }
        } while (valid);

        System.out.println("\n--------[ Sample Output ]--------\n");
        if (output) {
            System.out.println(input1 + " and " + input2 + " are Anagrams");
        } else {
            System.out.println(input1 + " and " + input2 + " are NOT Anagrams");
        }
    }
}
