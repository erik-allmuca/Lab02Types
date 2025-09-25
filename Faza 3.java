import java.util.Scanner;

public class TicketCalculator {
    public static void main(String[] args) {

        final double TVSH = 0.10;
        final int ZBRITJE_NX = 5;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Shkruaj çmimin bazë (lek): ");
        int basePrice = scanner.nextInt();


        System.out.print("A je nxënës? (true/false): ");
        boolean isStudent = scanner.nextBoolean();


        double taxAmount = basePrice * TVSH;


        double totalWithTax = basePrice + taxAmount;


        double finalPrice = isStudent ? totalWithTax - ZBRITJE_NX : totalWithTax;

       


        int totalToPay = (int) Math.round(finalPrice);


        System.out.println("Çmimi bazë: " + basePrice + " lek");
        System.out.println("TVSH (10%): " + taxAmount + " lek");
        System.out.println("Ndërmjetëse me TVSH: " + totalWithTax + " lek");
        if (isStudent) {
            System.out.println("Zbritje nxënësi: " + ZBRITJE_NX + " lek");
        }
        System.out.println("Totali për pagesë: " + totalToPay + " lek");

        scanner.close();
    }
}
