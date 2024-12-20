package method;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a
        System.out.print("Nhap vao ky tu: ");
        char n = sc.next().charAt(0);
        System.out.println("Sau khi chuyen doi: " + toLowCase(n));

        //b
        System.out.print("Nhap vao a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap vao b: ");
        double b = sc.nextDouble();
        System.out.print("Ket qua phuong trinh bac 1 la: ");
        ptBac1(a, b);

        //c
        System.out.print("Nhap vao x: ");
        double x = sc.nextDouble();
        System.out.print("Nhap vao y: ");
        double y = sc.nextDouble();
        System.out.print("Nhap vao z: ");
        double z = sc.nextDouble();
        System.out.print("Ket qua phuong trinh bac 2 la: ");
        ptBac2(x, y, z);

        //d
        System.out.print("Nhap vao so thu nhat: ");
        double s1 = sc.nextDouble();
        System.out.print("Nhap vao so thu hai: ");
        double s2 = sc.nextDouble();
        System.out.print("Nhap vao so thu ba: ");
        double s3 = sc.nextDouble();
        System.out.print("Nhap vao so thu tu: ");
        double s4 = sc.nextDouble();
        System.out.println("Gia tri nho nhat la: " + min(s1, s2, s3, s4));

    }

    //a
    public static char toLowCase(char character) {
            if (character >= 'A' && character <= 'Z') {
                character += 32;
            }
        return (char) (character >= 'A' && character <= 'Z' ? character + 32 : character);
    }

    //b
    public static void ptBac1(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }
    }

    //c
    public static void ptBac2(double a, double b, double c) {
        if (a == 0) { // a=0 => pt bậc 1
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
                System.out.println("Phuong trinh co nghiem x1 = " + (-b - Math.sqrt(delta)) / (2 * a)); // -b + căn bậc 2 delta
                System.out.println("Phuong trinh co nghiem x2 = " + (-b + Math.sqrt(delta)) / (2 * a));
            }
        }
    }

    //d
    public static double min(double a, double b, double c, double d) {
        double min = Math.min(a, b);
        min = Math.min(min, c);
        return Math.min(min, d);
    }
}
