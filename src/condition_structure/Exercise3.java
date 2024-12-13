package condition_structure;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // cach 1 : su dung bien tam
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

        // cach 2 : Khong su dung bien tam
        a = a + b;
        b = a - b;
        a = a - b;
    }
}
