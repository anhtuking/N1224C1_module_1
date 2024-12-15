package loop;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        int n = sc.nextInt();

        int a = 1;
        int sign = 1;

        while (a <= n) {
            System.out.print(a * sign + "\t");
            a = a * 2 + 1;
            sign = -sign;
        }
    }
}
