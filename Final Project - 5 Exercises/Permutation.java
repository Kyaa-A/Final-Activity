import java.util.Scanner;

public class Permutation {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        do {
            valid = true;
            try {
                System.out.print("[x] Enter an Input: ");
                String input = scan.nextLine().replaceAll("[,.]", "");

                String inputSplit[] = input.split(" ");
                int num[] = new int[inputSplit.length];

                for (int i = 0; i < num.length; i++) {
                    num[i] = Integer.parseInt(inputSplit[i]);
                }

                int f1 = num[0];
                int difference = num[0] - num[1];
                int f2 = difference;

                for (int i = f1 - 1; i >= 1; i--) {
                    f1 = f1 * i;
                }

                for (int i = f2 - 1; i >= 1; i--) {
                    f2 = f2 * i;
                }

                int permutation = f1 / f2;
                System.out.println("\n[x] Output: " + permutation);
                valid = false;
            } catch (Exception e) {
                System.out.println("\nInvalid, Please Try Again...\n");
                valid = true;
            }
        } while (valid);
    }
}