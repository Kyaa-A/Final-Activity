import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any number/word:\t");
        String input1 = scan.nextLine();
        System.out.print("Enter any number/word:\t");
        String input2 = scan.nextLine();

        String firstInput = input1.toLowerCase();
        String secondInput = input2.toLowerCase();

        char container1[] = firstInput.toCharArray();
        char container2[] = secondInput.toCharArray();

        Arrays.sort(container1);
        Arrays.sort(container2);

        boolean output = Arrays.equals(container1, container2);

        if (container1.length == container2.length) {
            if (output) {
                System.out.println(input1 + " and " + input2 + " are Anagrams");
            } else {
                System.out.println(input1 + " and " + input2 + " are NOT Anagrams");
            }
        } else {
            System.out.println(input1 + " and " + input2 + " are NOT Anagrams");
        }
    }
}
