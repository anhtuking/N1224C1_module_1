package loop;

import java.util.Scanner;

public class Exercise21a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        String str = String.valueOf(a);

        boolean flag = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.printf("%d is symmetric number", a);
        } else {
            System.out.printf("%d is NOT symmetric number", a);
        }
    }
}
