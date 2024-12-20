package loop;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int count = 0;
        int distance = 1; //2

        for (int i = 2; i <= n; i += 2) {
            if (count == distance) { // kiem tra
                System.out.print(-i + " ");
                count = 0;
                distance++;
            } else {
                System.out.print(i + " ");
                count++;  //1
            }
        }
    }
}

