package arraylist;

import java.util.ArrayList;
import java.util.Collections;

import static arraylist.Exercise2.*;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.print("Số nhân viên muốn thêm vào: ");
        int n = sc.nextInt();
        input(n);
        System.out.println("Nhân viên có điểm trung bình cao nhất:");
        diemTb(n, diemTb);
        System.out.print("Nhập tên nhân viên cần tìm:");
        String str = sc.next();
        findName(n, str);
        tuoiTang(n);
        for (int i = 0; i < n; i++) {
            output(i);
        }

    }

    // nv có điểm trung bình cao nhất
    public static void diemTb(int n, ArrayList<Double> list) {
        double max = Collections.max(list);
        for (int i = 0; i < n; i++) {
            if (diemTb.get(i) == max) {
                output(i);
            }
        }
    }

    // tìm nhân viên
    public static void findName(int n, String str) {
        for (int i = 0; i < n; i++) {
            if (str.equalsIgnoreCase(hoTen.get(i))) {
                output(i);
            } else {
                System.out.println("Không có nhân viên");
            }
        }
    }

    // tuổi tăng dần
    public static void tuoiTang(int n) {
        for (int i = 0; i < tuoi.size() - 1; i++) {
            for (int j = i + 1; j < tuoi.size(); j++) {
                if (tuoi.get(i) > tuoi.get(j)) {
                    Collections.swap(tuoi, i, j);
                    Collections.swap(hoTen, i, j);
                    Collections.swap(gioiTinh, i, j);
                    Collections.swap(luongCb, i, j);
                    Collections.swap(diemTb, i, j);
                }
            }
        }
    }
}
