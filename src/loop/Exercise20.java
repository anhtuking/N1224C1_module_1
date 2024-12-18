package loop;

import java.util.Scanner;

public interface Exercise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean validInput = false;

        int a;
        int b;
        int c;

        do {
            System.out.print("Enter a: ");
            a = sc.nextInt();
            System.out.print("Enter b: ");
            b = sc.nextInt();
            System.out.print("Enter c: ");
            c = sc.nextInt();
            if (a < 0 || b < 0 || c < 0) {
                System.out.println("Invalid input, enter positive integers.");
            } else {
                validInput = true;
            }
        } while (!validInput);

        int fa = 1;
        int fb = 1;
        int fc = 1;

        for (int i = 1; i <= a; i++) {
            fa *= i;
        }
        for (int i = 1; i <= b; i++) {
            fb *= i;
        }
        for (int i = 1; i <= c; i++) {
            fc *= i;
        }
        int s = fa + fb + fc;
        System.out.printf("The sum of %d! + %d! + %d! = %d\n", a, b, c, s);
    }
}
