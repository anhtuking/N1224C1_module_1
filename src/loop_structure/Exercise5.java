package loop_structure;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        for (int i = 2; i <= 2 * n; i += 2) {
            System.out.print(i + "\t");
        }
    }
}