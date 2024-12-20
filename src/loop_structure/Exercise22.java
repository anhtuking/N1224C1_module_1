package loop_structure;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int soLuongDX = 0;
        int tongDX = 0;

        int soLuongCP = 0;
        int tongCP = 0;

        int soLuongNT = 0;
        int tongNT = 0;

        for (int n = a; n <= b; n++) {
            String str = String.valueOf(n);
            boolean flag = true;
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                soLuongCP++;
                tongCP += n;
            }

            boolean flag2 = true;
            if (n<2){
                flag2 = false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag2 = false;
                    break;
                }
            }
            if (flag2) {
                soLuongNT++;
                tongNT += n;
            }
        }

        System.out.println("So doi xung: "  + soLuongDX + " Tong la: " + tongDX);
        System.out.println("So chinh phuong: "  + soLuongCP + " Tong la: " + tongCP);
        System.out.println("So nguyen to: "  + soLuongNT + " Tong la: " + tongNT);
    }
}
