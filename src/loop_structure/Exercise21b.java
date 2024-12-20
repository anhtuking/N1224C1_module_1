package loop_structure;

import java.util.Scanner;

public class Exercise21b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        boolean flag = true;

        if (n < 2) {
            flag = false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.printf("%d is prime number", n);
        } else {
            System.out.printf("%d is NOT prime number", n);
        }
    }
}
