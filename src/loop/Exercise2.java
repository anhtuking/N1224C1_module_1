package loop;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//        }

        for (int i = 1; i <= n; i+=2) {
            System.out.print( i + "\t");
        }
    }
}
