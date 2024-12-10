package java_overview;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao bien so xe cua ban (Gom 5 so): ");
        int n = sc.nextInt();

        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        int btn = sum % 10;
        System.out.println("So nut: " + btn);
    }
}