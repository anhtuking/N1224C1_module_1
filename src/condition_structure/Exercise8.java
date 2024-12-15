package condition_structure;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang: ");
        int month = sc.nextInt();

        System.out.print("Nhap nam: ");
        int year = sc.nextInt();

        int days;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = 30;
        }

        System.out.printf("So ngay trong thang %d nam %d la %d ngay.", month, year, days);
    }
}
