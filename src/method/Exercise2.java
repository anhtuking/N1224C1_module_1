package method;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        // a
        System.out.println("So dao: " + reversedNumber(a));
        // b
        if (isSymmetric(a)) {
            System.out.println("So doi xung");
        } else {
            System.out.println("Khong phai so doi xung");
        }
        //c
        if (isSquare(a)) {
            System.out.println("So chinh phuong");
        } else {
            System.out.println("Khong chinh phuong");
        }
        //d
        if (isPrime(a)) {
            System.out.println("So nguyen to");
        } else {
            System.out.println("Khong phai so nguyen to");
        }
        //e
        System.out.println("Tong so le: " + calculateTotalOldDigits(a));
        //f
        System.out.println("Tong so nguyen to: " + calculateTotalPrimeDigits(a));
        //g
        System.out.println("Tong so chinh phuong: " + calculateSquare(a));

    }

    // a
    public static int reversedNumber(int number) {
        int numberReverse = 0;
        while (number != 0) {
            int temp = number % 10;
            numberReverse = numberReverse * 10 + temp;
            number /= 10;
        }
        return numberReverse;
    }

    //b
    public static boolean isSymmetric(int number) {
        return number == reversedNumber(number);
    }

    //c
    public static boolean isSquare(int number) {
        return Math.sqrt(number) % 1 == 0;
    }

    //d
    public static boolean isPrime(int number) {
        boolean flag = true;
        if (number < 2) {
            return flag = false;
        }

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return flag = false;
            }
        }
        return flag = true;
    }

    //e
    public static int calculateTotalOldDigits(int number) {
        int total = 0;
        while (number != 0) {
            int temp = number % 10;
            if (temp % 2 != 0) {
                total += temp;
            }
            number /= 10;
        }
        return total;
    }

    //f
    public static int calculateTotalPrimeDigits(int number) {
        int total = 0;
        while (number != 0) {
            int temp = number % 10;
            if (isPrime(temp)) {
                total += temp;
            }
            number /= 10;
        }
        return total;
    }

    //g
    public static int calculateSquare(int number) {
        int totalSquare = 0;

        while (number != 0) {
            int temp = number % 10;
            if (isSquare(temp)) {
                totalSquare += temp;
            }
            number /= 10;
        }
        return totalSquare;
    }
}

