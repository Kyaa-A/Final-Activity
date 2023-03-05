import java.io.IOException;
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class ResiboPart2{
    
    public static void clearscreen(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
        Date date = new Date();  
    
        System.out.println("\tPURCHASE RECEIPT SYSTEM");
        System.out.println("\t  INPUT DETAILS BELOW");
    System.out.println(" "+"*".repeat(35));
        System.out.print(" Enter Cashier Name:\t  ");
            String name = scan.next();
        System.out.print(" Enter O.R. No:\t\t  ");
            String ORnum = scan.next();
    System.out.println(" "+"*".repeat(35));
        System.out.print(" Enter number of items:\t  ");
            int numOfItems = scan.nextInt();
    System.out.println(" "+"*".repeat(35));
        
        String products[] = new String[numOfItems];
        int prices[] = new int[numOfItems];
        int quantities[] = new int[numOfItems];

        String productName = "";
        int productQuantity = 0;
        for (int i = 1; i <= numOfItems; i++) {

            System.out.println(" Product " + i);
            System.out.println();
            System.out.print(" Enter Item Name:\t  ");
            productName = scan.next();
            products[i-1] = productName;

            System.out.print(" Enter Item Price:\t  ");
            int productPrice = scan.nextInt();
            prices[i-1] = productPrice;

            System.out.print(" Enter Item Quantity:\t  ");
            productQuantity = scan.nextInt();
            quantities[i-1] = productQuantity;
            
            System.out.println(" "+"-".repeat(35));
        }

        double productAmount = 0;
        double finalProductAmount = 0;
        for (int i = 0; i < numOfItems; i++) {
            productAmount = prices[i] * quantities[i];
            finalProductAmount += productAmount;
        }
        
        double tax = finalProductAmount*0.05;
        double totalPayment = finalProductAmount+tax;
        System.out.printf("%s%12s%.2f ", " TOTAL PAYMENT:",  "PHP ", totalPayment);
        System.out.println("\n "+"*".repeat(35));

        System.out.print(" Enter Customer Payment:   ");
        double payment = scan.nextInt();

        while(payment<totalPayment){
            System.out.print(" Enter Customer Payment:   ");
            payment = scan.nextInt();
        }
        System.out.println(" "+"*".repeat(35));

        clearscreen();

        System.out.println("\n\t\tGaisano Grand Mall");
        System.out.println("\t Mc Arthur Highway, Digos City");
        System.out.println("\tTel. #. 553-2847 Fax: 679652382");
        System.out.println("\t   GTS Reg. No. 00023648294");
        System.out.println("\t\tRCB: 529873290");

        System.out.println();

        System.out.println("\t\tPURCHASE RECEIPT\n");
        System.out.println(" Cashier: " + name);
        System.out.print(" Date: " + formatter.format(date) + " ".repeat(15));
        System.out.println("O.R No.: " + ORnum);
        System.out.println(" "+"*".repeat(45));
        System.out.println(" Qty.\tItem/s\t\t\t    Price/s");
        System.out.println(" "+"-".repeat(45));    

        int quantity = 0;
        String product = "";
        double totalPrice = 0;
        for (int i = 0; i < numOfItems; i++) {
            quantity = quantities[i];
            product = products[i];
            totalPrice = prices[i] * quantities[i];
            System.out.printf(" %-7d%-13s%21.2f ", quantity, product, totalPrice);
            System.out.println();
        }

        System.out.println(" "+"*".repeat(45));

        double change = payment - totalPayment;
        System.out.printf("%-8s%28s%.2f \n", " SUBTOTAL", "PHP ", finalProductAmount);
        System.out.printf("%-8s%29s%.2f \n", " VAT(5%)", "PHP ", tax);
        System.out.println();
        System.out.printf("%-8s%29s%.2f \n", " TOTAL", "PHP ", totalPayment);
        System.out.println();
        System.out.printf("%-8s%29s%.2f \n", " CASH", "PHP ", payment);
        System.out.printf("%-8s%29s%.2f \n", " CHANGE", "PHP ", change);
        System.out.println();
        System.out.println("\t      THANK YOU FOR SHOPPING!\n");
    }
}