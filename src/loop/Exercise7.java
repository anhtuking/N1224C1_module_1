package loop;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        int n = sc.nextInt();

        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        while (fn < n) {
            System.out.print(fn + "\t");

            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }
}
