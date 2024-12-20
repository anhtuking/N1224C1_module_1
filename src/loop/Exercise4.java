package loop;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
// cach 1
        for (int i = 2; i <= n; i += 2) {
            if (i % 3 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
// cach 2
        int count = 0;
        for (int i = 2; i <= n; i += 2) {
            count++;
            if (count % 3 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
