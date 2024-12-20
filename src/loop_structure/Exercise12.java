package loop_structure;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen n: ");
        int n = sc.nextInt();

        int tong = 0;
        int tich = 1;

        while (n > 0) {
            int digit = n % 10;
            tong += digit;
            tich *= digit;
            n /= 10;
        }

        System.out.print("Tong cac chu so: " + tong + "\n");
        System.out.print("Tich cac chu so: " + tich);
    }
}
