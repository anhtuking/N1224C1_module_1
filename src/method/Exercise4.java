package method;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        System.out.printf("Uoc chung lon nhat cua %d va %d la %d. ", a, b, uocSC(a, b));
    }

    public static int uocSC(int a, int b) {
        int ucln = 1;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
                break;
            }
        }
        return ucln;
    }
}
