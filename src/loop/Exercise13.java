package loop;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so nguyen duong a: ");
        int a = sc.nextInt();

        System.out.print("Nhap vao so nguyen duong b: ");
        int b = sc.nextInt();

        //ucln
        int ucln = 1;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
                break;
            }
        }

        //bcnn
        int bcnn;
        for (int i = a; true; i++) {
            if (i % a == 0 && i % b == 0) {
                bcnn = i;
                break;
            }
        }

        System.out.printf("Uoc chung lon nhat cua %d va %d la %d. ", a, b, ucln);
        System.out.printf("Boi chung nho nhat cua %d va %d la %d. ", a, b, bcnn);
    }
}
