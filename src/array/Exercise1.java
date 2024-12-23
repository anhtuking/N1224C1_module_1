package array;

import java.util.Scanner;

public class Exercise1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // buoc 1: nhap so luong cua mang
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap vao so luong phan tu cua mang: ");
            n = sc.nextInt();
        } while (n < 1);
        //buoc 2: new mang
        int[] arr = new int[n];
        //buoc 3: nhap mang
        inputArray(arr, sc);
        //buoc 4: xuat mang
        outputArray(arr);
        System.out.println("Co phai mang toan chan: " + isFullEven(arr)); // 2a
        System.out.println("Co phai mang toan so nguyen to: " + isFullPrime(arr)); // 2b
        System.out.println("Co phai tang dan: " + isAsc(arr)); // 2c
        System.out.println("So luong phan tu le: " + countOdd(arr)); // 3a
        System.out.println("Tong so duong le: " + sumPositiveOdd(arr)); // 3b
        System.out.println("So luong so chia het cho 4 nhung khong chia het cho 5: " + countDivisible4Not5(arr)); // 3c
        System.out.println("Tong cac so nguyen to: " + sumPrimes(arr)); // 3d
        System.out.println("Vi tri cuoi cung cua x: " + lastIndexOfX(arr, 5)); // 4a
        System.out.println("Vi tri dau tien cua so nguyen to: " + firstPrimeIndex(arr)); // 4b
        System.out.println("So duong nho nhat: " + minPositive(arr)); // 4c
        int k = 5;
        System.out.println("Có chứa số " + k + " trong mảng không? " + contains(arr, k)); // 4d
        int[] minMax = minMax(arr);
        System.out.println("Giá trị nhỏ nhất: " + minMax[0]); // 4e
        System.out.println("Giá trị lớn nhất: " + minMax[1]); // 4e

    }

    private static void inputArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap vao phan tu a[%d]: ", i);
            arr[i] = sc.nextInt();
        }
    }

    private static void outputArray(int[] arr) {
        // foreach
        for (int item : arr){
            if (item % 2 != 0) {
                return;
            }
            System.out.println(item);
        }
    }
    //2a. mang toan chan
    private static boolean isFullEven(int[] arr) {
        for (int j : arr) {
            if (j % 2 == 1)
                return false;
        }
        return true;
    }
    //2b. toan so nguyen to
    private static boolean isFullPrime(int[] arr) {
        for (int num : arr) {
            if (!isPrime(num))
                return false;
        }
        return true;
    }
    private static boolean isPrime(int num) {
        if(num<=1) return false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    //2c. mang tang dan
    private static boolean isAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }
    //3a. dem so luong phan tu le
    private static int countOdd(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    //3b. tinh tong so duong le
    private static int sumPositiveOdd(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 0 && num % 2 != 0) {
                sum += num; // Cộng vào tổng nếu số dương và lẻ
            }
        }
        return sum;
    }
    //3c. bao nhieu so chia het cho 4 nhung khong chia het cho 5
    private static int countDivisible4Not5(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 4 == 0 && num % 5 != 0) {
                count++;
            }
        }
        return count;
    }
    //3d. tinh tong cac so nguyen to trong mang
    private static int sumPrimes(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (isPrime(num)) {
                sum += num;
            }
        }
        return sum;
    }
    //4a. vi tri cuoi cung cua phan tu x trong mang
    private static int lastIndexOfX(int[] array, int x) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }
    //4b. vi tri so nguyen to dau tien trong mang
    private static int firstPrimeIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                return i;
            }
        }
        return -1;
    }
    //4c. tim so duong nho nhat trong mang
    private static int minPositive(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min)
                min = i;
        }
        return min;
    }
    //4d. nhap vao phan tu k, tim k co xuat hien khong
    private static boolean contains(int[] array, int k) {
        for (int num : array) {
            if (num == k) {
                return true;
            }
        }
        return false;
    }
    //4e. tim gia tri lon nhat va nho nhat cua mang
    private static int[] minMax(int[] array) {
        if (array.length == 0) return new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE};

        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[] {min, max};
    }
}
