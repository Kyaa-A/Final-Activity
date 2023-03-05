import java.util.Scanner;

public class ResiboPart1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String ProductName = "";
        double subtotal = 0;
        int totalpayment = 0;

        System.out.println("--------------------[Input]--------------------\n");
        System.out.print("Enter number of items: ");
        int items = scan.nextInt();
        String productName[] = new String[items];
        int Quantity[] = new int[items];
        double price[] = new double[items];

        for (int i = 0; i < items; i++) {
            System.out.print("\nEnter Product[" + (i+1) + "] Name: ");
            productName[i] = scan.next();
            System.out.print("Enter Quantity[" + (i+1) + "]: ");
            Quantity[i] = scan.nextInt();
            System.out.print("Enter a Price[" + (i+1) + "]: ");
            price[i] = scan.nextDouble();

            subtotal = price[i] * Quantity[i];
            totalpayment += subtotal;

        }
        System.out.println("\n--------------------[Output]--------------------\n");
        System.out.printf("\t%-8s %-5s %-8s %-5s", "item", "Qty.", "Price", "Subtotal");
        System.out.print("\n" + "*".repeat(48)+ "\n");
        for (int i = 0; i < items; i++) {
            double ItemSubtotal = Quantity[i] * price[i];
            
            System.out.printf("\t%-8s %-5d %-8.2f %-5.2f",productName[i], Quantity[i], price[i], ItemSubtotal);
            System.out.println();
        }
        System.out.println("\nTOTAL:\t"+ totalpayment);
    }
}