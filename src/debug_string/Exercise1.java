package debug_string;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        String str = "  Hello  World";

        //a
        System.out.println(str.substring(6));
        //b
        System.out.println(str.replace('o', 'f'));
        //c - cach1
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println(count);
        //c - cach2
        int count2 = str.length() - str.replace("l", "").length();
        System.out.println(count2);
        //d
        System.out.println("Vị trí đầu: " + str.indexOf("l"));
        System.out.println("Vị trí cuối: " + str.lastIndexOf("l"));
        //e
        System.out.println(str.replace(" ", ""));
        //f
        System.out.println(str.trim());
        //g
        StringBuilder dao = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            dao.append(str.charAt(i));
        }
        System.out.println(dao);
        //h
        System.out.println("SQC".concat(str));
        //i
        System.out.println(str.toUpperCase());
//        System.out.println(str.toUpperCase(Locale.of("")));
        //k
        System.out.println(str.toLowerCase());
        //l
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap m: ");
        int m = sc.nextInt();
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        System.out.printf("Chuoi con tu ki tu %d den %d la: %s", m, n, str.substring(m, n));

    }
}

