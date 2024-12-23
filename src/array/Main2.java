package array;

import java.util.Scanner;

public class Main2 {
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
        System.out.println("Tong so le: ");sumNumber(n, arr);
    }

    private static void inputArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap vao phan tu a[%d]: ", i);
            arr[i] = sc.nextInt();
        }
    }

    private static void outputArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                return false;
//            }
//        }
//        return false;

        // foreach
        for (int item : arr){
            if (item % 2 != 0) {
                return;
            }
        }
    }

    private static void sumNumber(int n, int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            n += i;
        }
    }
}







