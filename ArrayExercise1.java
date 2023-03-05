import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num[] = new int[10];
        int evenNum[] = new int[10];
        int oddNum[] = new int[10];
        int decision = 0;

        System.out.println("*************INPUT***************\n");

        for (int i = 0; i < num.length; i++) {
            System.out.print("\tEnter a number:   ");
            num[i] = scan.nextInt();
        }
        scan.close();

        for (int i = 0; i < 10; i++) {
            decision = num[i] % 2;

            if (decision == 0) {
                evenNum[i] = num[i];
            } else {
                oddNum[i] = num[i];
            }
        }

        System.out.println("\n*************OUTPUT**************\n");
        System.out.print("Even Elements:\t");
        for (int i = 0; i < evenNum.length - 3; i++) {
            if (evenNum[i] != 0) {
                System.out.print(evenNum[i]);
                if (i >= 0) {
                    System.out.print(", ");
                }
            }
        }
        System.out.print(evenNum[evenNum.length - 3]);
        System.out.println();

        System.out.print("Odd Elements:\t");
        for (int i = 0; i < oddNum.length - 1; i++) {
            if (oddNum[i] != 0) {
                System.out.print(oddNum[i]);
                if (i >= 0) {
                    System.out.print(", ");
                }
            }
        }
        System.out.print(oddNum[oddNum.length - 1] + "\n");
    }
}