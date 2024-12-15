package condition_structure;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong: ");
        int n = sc.nextInt();

        double squareRoot = Math.sqrt(n);

        if (squareRoot % 1 == 0) {
            System.out.println(n + " la so chinh phuong");
        } else {
            System.out.println(n + " khong la so chinh phuong");
        }
    }
}
