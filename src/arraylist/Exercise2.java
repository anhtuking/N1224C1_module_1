package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> hoTen = new ArrayList<>();
    static ArrayList<Integer> tuoi = new ArrayList<>();
    static ArrayList<String> gioiTinh = new ArrayList<>();
    static ArrayList<Double> luongCb = new ArrayList<>();
    static ArrayList<Double> diemTb = new ArrayList<>();

    public static void input(int n) {
        double diem;
        System.out.println("==== Nhập thông tin nhân viên ====");
        for (int i = 0; i < n; i++) {
            System.out.print("Tên nhân viên: ");
            hoTen.add(sc.next());
            System.out.print("Tuổi nhân viên: ");
            tuoi.add(sc.nextInt());
            System.out.print("Giới tính: ");
            gioiTinh.add(sc.next());
            System.out.print("Lương cơ bản: ");
            luongCb.add(sc.nextDouble());
            do {
                System.out.print("Điểm TB: ");
                diem = sc.nextDouble();
                if (diem < 0 || diem > 10) {
                    System.out.println("Điểm không hợp lệ! Nhập lại.");
                }
            } while (diem < 0 || diem > 10);
            diemTb.add(diem);
        }
    }

    public static void output(int i) {

        System.out.println("==== Thông tin nhân viên ====");
        System.out.println("Tên nhân viên: " + hoTen.get(i));
        System.out.println("Tuổi nhân viên: " + tuoi.get(i));
        System.out.println("Giới tính: " + gioiTinh.get(i));
        System.out.println("Lương cơ bản: " + luongCb.get(i));
        System.out.println("Điểm TB: " + diemTb.get(i));

    }
}
