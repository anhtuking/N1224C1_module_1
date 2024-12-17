package condition_structure;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang: ");
        int month = sc.nextInt();

        System.out.print("Nhap nam: ");
        int year = sc.nextInt();

        int days = 0;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                // 2 điều kiện để là năm nhuận: (chia hết cho 4 và không chia hết cho 100) hoặc (chia hết cho 400)
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("invalid month");
        }
        System.out.printf("So ngay trong thang %d nam %d la %d ngay.", month, year, days);
    }
}
