package java_overview;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao ban kinh hinh tron: ");
        double r = sc.nextDouble();

        double C = 2 * Math.PI * r;
        System.out.println("Chu vi: C = " + C);

        double A = Math.PI * Math.pow(r, 2);
        System.out.println("Dien tich: A = " + A);
    }
}
