package loop;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        int n = sc.nextInt();
        // Dãy số Fibonacci là một dãy số bắt đầu bằng 0 và 1, các số tiếp theo bằng tổng của hai số liền trước.
        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        while (fn < n) {
            System.out.print(fn + "\t");
            // cập nhật giá trị của f1 và f2
            f1 = f2;
            f2 = fn;
            fn = f1 + f2; // tính giá trị của fn rồi quay lên ktra điều kiện
        }
    }
}
