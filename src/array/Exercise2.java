package array;

import java.util.Scanner;

public class Exercise2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] hoTen = new String[5];
        int[] tuoi = new int[5];
        String[] gioiTinh = new String[5];
        double[] luong = new double[5];
        double[] diemTB = new double[5];

        inputInfor(hoTen, tuoi, gioiTinh, luong, diemTB);
        displayInfor(hoTen, tuoi, gioiTinh, luong, diemTB);

        Exercise3 employeeSearch = new Exercise3(hoTen, tuoi, gioiTinh, luong, diemTB);
        employeeSearch.searchEmployee();
    }

    private static void inputInfor(String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luong, double[] diemTB) {
        System.out.println("\nThông tin các nhân viên:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            hoTen[i] = sc.nextLine();
            System.out.print("Tuổi: ");
            tuoi[i] = sc.nextInt();
            System.out.print("Giới tính: ");
            gioiTinh[i] = sc.nextLine();
            System.out.print("Lương cơ bản: ");
            luong[i] = sc.nextDouble();
            System.out.print("Điểm TB: ");
            diemTB[i] = sc.nextDouble();
            sc.nextLine();
        }
    }

    private static void displayInfor(String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luong, double[] diemTB) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhân viên thứ " + (i + 1) + ":");
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Tuổi: " + tuoi[i]);
            System.out.println("Giới tính: " + gioiTinh[i]);
            System.out.println("Lương cơ bản: " + luong[i]);
            System.out.println("Điểm TB: " + diemTB[i]);
            System.out.println("--------------------");
        }
    }
}