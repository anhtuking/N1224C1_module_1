package method;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int a = sc.nextInt();

        System.out.print("Fibonacci:  ");
        Fibonacci(a);

    }

    public static void Fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Nhap vao mot so duong.");
            return;
        }

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
