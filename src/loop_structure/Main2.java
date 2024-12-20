package loop_structure;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;

        do {
            System.out.print("Enter an score from 0 to 10: ");
            a = sc.nextDouble();
            if (a < 0 || a > 10) {
                System.out.println("Invalid score, enter again!");
            }
        } while (a < 0 || a > 10);

        System.out.println("Score: " + a);
    }
}
