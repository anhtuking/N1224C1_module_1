package condition_structure;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ngay: ");
        int day = sc.nextInt();
        System.out.print("Nhap thang: ");
        int month = sc.nextInt();
        System.out.print("Nhap nam: ");
        int year = sc.nextInt();

        boolean checkNamNhuan = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30) || ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day <= 31) || (month == 2 && day < 29) || (month == 2 && checkNamNhuan && day <= 29)) {
            if (checkNamNhuan && month == 2 && (day == 29 || day == 28)) {
                if (day == 28) {
                    System.out.println("Tiep theo: " + (day + 1) + " " + month + " " + year);
                } else {
                    System.out.println("Truoc do: " + 1 + " " + (month + 1) + " " + year);
                }
                System.out.println("Truoc do: " + (day - 1) + " " + month + " " + year);
            } else if (checkNamNhuan && month == 3 && day == 1) {
                System.out.println("Tiep theo: " + (day + 1) + " " + month + " " + year);
                System.out.println("Truoc do: " + 29 + " " + (month - 1) + " " + year);
            } else {
                if (month == 2 && day == 28) {
                    System.out.println("Tiep theo: " + 1 + " " + (month + 1) + " " + year);
                    System.out.println("Truoc do: " + (day - 1) + " " + month + " " + year);
                } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 1) {
                    System.out.println("Tiep theo: " + (day + 1) + " " + month + " " + year);
                    System.out.println("Truoc do: " + 31 + " " + (month - 1) + " " + year);
                } else if ((month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day == 1) {
                    System.out.println("Tiep theo: " + (day + 1) + " " + month + " " + year);
                    System.out.println("Truoc do: " + 30 + " " + month + " " + year);
                } else if (month == 3 && day == 1) {
                    System.out.println("Tiep theo: " + (day + 1) + " " + month + " " + year);
                    System.out.println("Truoc do: " + 28 + " " + (month - 1) + " " + year);
                } else if (((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) || ((month == 1 || month == 5 || month == 7 || month == 8 || month == 10 || month == 3) && day == 31)) {
                    System.out.println("Tiep theo: " + 1 + " " + (month + 1) + " " + year);
                    System.out.println("Truoc do: " + (day - 1) + " " + month + " " + year);
                } else if (month == 12 && day == 31) {
                    System.out.println("Tiep theo: " + 1 + " " + 1 + " " + (year + 1));
                    System.out.println("Truoc do: " + (day - 1) + " " + month + " " + year);
                } else if (month == 1 && day == 1) {
                    System.out.println("Tiep theo: " + (day + 1) + " " + month + " " + year);
                    System.out.println("Truoc do: " + 31 + " " + 12 + " " + (year - 1));
                } else {
                    System.out.println("Tiep theo: " + (day + 1) + " " + month + " " + year);
                    System.out.println("Truoc do: " + (day - 1) + " " + month + " " + year);
                }
            }
        } else {
            System.out.println("ngay thang nam khong hop le");
        }
    }
}
