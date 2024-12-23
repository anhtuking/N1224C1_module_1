package array;

import java.util.Scanner;

public class Exercise3 {
    private String[] hoTen;
    private int[] tuoi;
    private String[] gioiTinh;
    private double[] luong;
    private double[] diemTB;
    private Scanner sc;

    public Exercise3(String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luong, double[] diemTB) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
        this.diemTB = diemTB;
        this.sc = new Scanner(System.in);
    }

    public void searchEmployee() {
        System.out.print("Nhập tên nhân viên cần tìm: ");
        String searchName = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < hoTen.length; i++) {
            if (hoTen[i].equalsIgnoreCase(searchName)) {
                System.out.println("Thông tin nhân viên " + searchName + ":");
                System.out.println("Tuổi: " + tuoi[i]);
                System.out.println("Giới tính: " + gioiTinh[i]);
                System.out.println("Lương cơ bản: " + luong[i]);
                System.out.println("Điểm TB: " + diemTB[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy nhân viên với tên: " + searchName);
        }
    }
}