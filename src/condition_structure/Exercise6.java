package condition_structure;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            } else {
                System.out.println("Phuong trinh co nghiem x = " + -c / b);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep la x = " + -b / (2 * a));
            } else {
                System.out.println("Phuong trinh co nghiem x1 = " + (-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phuong trinh co nghiem x2 = " + (-b + Math.sqrt(delta)) / (2 * a));
            }
        }
    }
}
