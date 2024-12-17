package loop;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price: ");
        int price = sc.nextInt();

        System.out.print("Enter amount paid by customer: ");
        int paid = sc.nextInt();

        int refund = paid - price; // tiền thối lại
        int value;                 // mệnh giá

        for (int i = 2; i >= 0; i++) {
            int coefficient = (int) Math.pow(10, i);

            value = 5000 * refund;
            if (refund > value) {
                System.out.printf("%d bills %d\n", refund / value, value);
                refund %= value;
            }

            value = 2000 * refund;
            if (refund > value) {
                System.out.printf("%d bills %d\n", refund / value, value);
                refund %= value;
            }

            value = 1000 * refund;
            if (refund > value) {
                System.out.printf("%d bills %d\n", refund / value, value);
                refund %= value;
            }
        }
        System.out.println("Amount to be refunded: " + refund);
    }
}
