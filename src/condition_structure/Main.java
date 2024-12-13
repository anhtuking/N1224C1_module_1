package condition_structure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        double score = sc.nextDouble();

        if (score > 10 || score < 0) {
            System.out.println("Sorry, but you entered a negative score");
        } else if (score < 5) {
            System.out.println("Yeu");
        } else if (score < 6.5) {
            System.out.println("Trung binh");
        } else if (score < 8) {
            System.out.println("Kha");
        } else {
            System.out.println("Gioi");
        }
    }
}
