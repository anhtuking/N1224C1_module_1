package java_overview;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ten san pham: ");
        String tenSanPham = sc.nextLine();
        System.out.print("so luong: ");
        int soLuong = sc.nextInt();
        System.out.print("don gia: ");
        double donGia = sc.nextDouble();

        double tien = soLuong * donGia;
        double thue = tien * 0.1;

        System.out.println("Ten san pham: " + tenSanPham);
        System.out.println("Gia tien: " + tien + " vnd");
        System.out.println("Thue VAT: " + thue + " vnd");

    }
}
