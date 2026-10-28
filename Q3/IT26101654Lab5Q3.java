import java.util.Scanner;

public class IT26101654Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE = 48000.0;
        final double DISCOUNT_MEDIUM = 10.0;
        final double DISCOUNT_HIGH = 20.0;
        final int MIN_DATE = 1;
        final int MAX_DATE = 31;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < MIN_DATE || startDate > MAX_DATE
                || endDate < MIN_DATE || endDate > MAX_DATE) {
            System.out.println("Error: Days must be between 1 and 31");
            input.close();
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            input.close();
            return;
        }

        int days = endDate - startDate;
        double total = days * ROOM_CHARGE;

        if (days >= 5) {
            total = total - (total * DISCOUNT_HIGH / 100);
        } else if (days >= 3) {
            total = total - (total * DISCOUNT_MEDIUM / 100);
        }

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: " + total);

    }
}