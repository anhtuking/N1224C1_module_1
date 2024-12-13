package condition_structure;

import java.util.Scanner;

public class TertiaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = (a>b) ? a : b;
        int min = (a<b) ? a : b;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
