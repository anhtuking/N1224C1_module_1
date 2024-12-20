package method;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int a = sc.nextInt();

        //a
        System.out.println("Tong 1 + 2 + ... + n = " + sumNumbers(a));
        //b
        System.out.println("Tong 1^2 + 2^2 + ... + n^2 = " + sumSqure(a));
        //c
        System.out.println("Tong 1 + 1/2 + ... + 1/n = " + sumReciprocal(a));
        //d
        System.out.println("Tich 1 * 2 * ... * n = " + factorial(a));
        //e
        System.out.println("Tong 1! + 2! + ... + n! = " + factorialSum(a));
    }

    //a
    public static int sumNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //b
    public static int sumSqure(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
        }
        return sum;
    }

    //c
    public static double sumReciprocal (double n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    //d
    public static long factorial (int n) {
        long answer = 1;
        for (int i = 1; i <= n; i++) {
            answer *= i;
        }
        return answer;
    }

    //e
    public static long factorialSum (int n) {
        long fact = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact;
        }
        return sum;
    }
}
