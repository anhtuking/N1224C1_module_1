package loop;

import java.util.Scanner;

public interface Exercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        int fa = 1;

        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int fb = 1;

        System.out.print("Enter c: ");
        int c = sc.nextInt();
        int fc = 1;

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invalid input, enter a positive integer");
        } else {
            for (int i = 1; i <= a; i++) {
                fa *= i;
            }
            for (int i = 1; i <= b; i++) {
                fb *= i;
            }
            for (int i = 1; i <= c; i++) {
                fc *= i;
            }
        }

        int s = fa + fb + fc;
        System.out.printf("The sum of %d! + %d! + %d! = %d", a, b, c, s);

    }
}
