import java.util.Scanner;

public class twoDExercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of Rows: ");
        int row = scan.nextInt();

        System.out.print("Enter number of Columns: ");
        int column = scan.nextInt();

        int table[][] = new int[row+1][column+1];

        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[i].length; j++) {
                System.out.printf("%-4d", table[i][j]=(i)*(j));
            }
            System.out.println();
        }
    }   
}