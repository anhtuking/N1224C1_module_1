package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // arraylist

        // buoc 1: nhap so luong cua mang

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap vao so luong phan tu cua mang: ");
            n = sc.nextInt();
        } while (n < 1);

        //buoc 2: new mang
        ArrayList<Integer> arrayList = new ArrayList<>(); //input KO su dung .size()
        //buoc 3: nhap mang
        inputArray(arrayList, n);
        //buoc 4: xuat mang
        outputArray(arrayList);
    }

    static void inputArray(ArrayList<Integer> arrayList, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("nhap vao: ");
            arrayList.add(sc.nextInt());
        }
    }

    private static void outputArray(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}

