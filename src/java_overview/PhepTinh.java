package java_overview;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PhepTinh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so nguyen tu ban phim.");
        System.out.print("Nhap a: ");
        int a = in.nextInt();
        System.out.print("Nhap b: ");
        int b = in.nextInt();
        System.out.println("Tong: " + (a + b));
        System.out.println("Hieu: " + (a - b));
        System.out.println("Tich: " + (a * b));
        System.out.println("Thuong: " + ((double) a / b));
    }
}
