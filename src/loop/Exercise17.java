package loop;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        // hinh a
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == length || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // hinh b
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == length || j == length - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
