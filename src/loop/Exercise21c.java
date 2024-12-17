package loop;

import java.util.Scanner;

public class Exercise21c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        String str = String.valueOf(n);

        boolean flag = true;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) >= str.charAt(i + 1)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.printf("%d is an increasing sequence of numbers", n);
        } else {
            System.out.printf("%d is NOT an increasing sequence of numbers", n);
        }
    }
}
