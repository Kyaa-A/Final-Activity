import java.util.Random;
import java.util.Scanner;

public class Bato2PickPart1 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    boolean valid = false;

    System.out.println("[!]Options to choose from:\n1. Rock\n2. Paper\n3. Scissors");
    do {
        valid = true;
        try {
            System.out.print("\n[x]Enter a pick: ");
            int pTurn = scan.nextInt();
            int cTurn = rand.nextInt(3) + 1;
            System.out.println("[x]The computer pick " + cTurn);
        
            if(pTurn == 1 && cTurn == 3 || pTurn == 2 && cTurn == 1 || pTurn == 3 && cTurn == 2){
                System.out.println("\n-----[ You Win ]-----");
            }else if(pTurn == 3 && cTurn == 1 || pTurn == 1 && cTurn == 2 || pTurn == 2 && cTurn == 3){
                System.out.println("\n-----[ You Lose ]-----");
            }else{
                System.out.println("\n-----[ TIE ]-----");
            }
            valid = false;
        } catch (Exception e) {
            scan.nextLine();
            System.out.println("Invalid Data Type, Please Try Again...");
            valid = true;
        }
    } while (valid);
  }
}
