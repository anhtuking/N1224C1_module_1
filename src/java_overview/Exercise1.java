package java_overview;

import java.time.Year;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào năm sinh của bạn: ");
        int n = sc.nextInt();
        System.out.print("Tuổi của bạn là: " + (Year.now().getValue()-n));
    }
}

// how to (đặt câu hỏi) in java