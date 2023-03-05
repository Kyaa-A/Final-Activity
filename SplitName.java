import java.util.Scanner;

public class SplitName {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean valid = false;
    do {
      try {
        System.out.print("Enter your Name: ");
        String name = scan.nextLine().replaceAll("[.,]", "");
        String[] splitName = name.split(" ");
        char container = splitName[1].charAt(splitName[1].indexOf("-") + 1);
        splitName[1] = Character.toString(container) + ".";

        for (int i = 0; i < splitName.length; i++) System.out.print(
          splitName[i] + " "
        );
        System.out.println();

        for (int i = 0; i < splitName.length; i++) System.out.print(
          splitName[i].charAt(0)
        );
        System.out.println();
        valid = false;
      } catch (Exception e) {
        System.out.println("Invalid Input, Please Try Again...\n");
        valid = true;
      }
    } while (valid);
  }
}
