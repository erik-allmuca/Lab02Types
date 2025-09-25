import java.util.Scanner;

public class PriceCalculation {
    public static void main(String[] args) {
        final double DISCOUNT_PERCENTAGE = 12.5; 
        final int MIN_TOTAL = 30;              

        Scanner sc = new Scanner(System.in);


        System.out.print("Shkruaj çmimin bazë (lek): ");
        int base = sc.nextInt();


        if (base <= 0) {
            System.out.println("Gabim: çmimi bazë duhet të jetë > 0.");
            sc.close();
            return;
        }


        System.out.print("A je nxënës? (true/false): ");
        boolean isStudent;
        try {
            isStudent = sc.nextBoolean();
        } catch (Exception e) {
            System.out.println("Paralajmërim: Vlera e nxënësit nuk është boolean. Supozohet false.");
            isStudent = false;
            sc.nextLine(); 
        }


        double discountMultiplier = 1.0;
        if (isStudent) {
            discountMultiplier -= DISCOUNT_PERCENTAGE / 100.0;
        }


        float totalFloat = (float) base * (float) discountMultiplier;
        double totalDouble = base * discountMultiplier;


        totalFloat = totalFloat < MIN_TOTAL ? MIN_TOTAL : totalFloat;
        totalDouble = totalDouble < MIN_TOTAL ? MIN_TOTAL : totalDouble;


        int roundedTotalFloat = Math.round(totalFloat);
        int castTotalFloat = (int) totalFloat;

        int roundedTotalDouble = (int) Math.round(totalDouble);
        int castTotalDouble = (int) totalDouble;


        System.out.printf("Totali me float (pas zbritjes dhe rafshimit bankar): %d\n", roundedTotalFloat);
        System.out.printf("Totali me float (pas zbritjes dhe cast direkt): %d\n", castTotalFloat);

        System.out.printf("Totali me double (pas zbritjes dhe rafshimit bankar): %d\n", roundedTotalDouble);
        System.out.printf("Totali me double (pas zbritjes dhe cast direkt): %d\n", castTotalDouble);

        sc.close();
    }
}
