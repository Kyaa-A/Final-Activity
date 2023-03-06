import java.util.ArrayList;
import java.util.Scanner;

public class CountMeIn {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    ArrayList<Character> charList = new ArrayList<>();
    ArrayList<Integer> countList = new ArrayList<>();

    System.out.print("[!] Sample Input: ");
    String input = scan.nextLine().toLowerCase().replaceAll("[\\s+ \\W+]", "");

    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);

      int index = charList.indexOf(c);
      if (index >= 0) {
        countList.set(index, countList.get(index) + 1);
      } else {
        charList.add(c);
        countList.add(1);
      }
    }

    System.out.println("\n=====" + charList + "=====\n=====" + countList + "=====\n");

    int maxIndex = 0;
    for (int i = 1; i < countList.size(); i++) {
      if (countList.get(i) > countList.get(maxIndex)) {
        maxIndex = i;
      }
    }

    char maxChar = charList.get(maxIndex);

    String maxCharString = Character.toString(maxChar);
    System.out.println("[1] Sample output: " + maxCharString);
  }
}
