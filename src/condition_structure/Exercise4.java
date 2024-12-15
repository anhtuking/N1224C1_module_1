package condition_structure;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer.");

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;

        System.out.println("The max is: " + max);
        System.out.println("The min is: " + min);
    }
}
