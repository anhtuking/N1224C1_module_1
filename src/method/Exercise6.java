package method;

import java.util.Scanner;

public class Exercise6 {
    public static String name;
    public static int age;
    public static boolean gender;
    public static double basicSalary;
    public static double graduationScore;

    public static void main(String[] args) {
        inputInfo();
        displayInfo();
    }

    public static void inputInfo(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());

//        System.out.print("Nhập giới tính: ");
//        gender = sc.nextLine();
        int choose;
        do {
            System.out.println("==== MENU ====");
            System.out.println("1. Nam");
            System.out.println("2. Nu");
            System.out.println("3. Khac");

            System.out.println("Moi ban chon gioi tinh.");
            choose = sc.nextInt();

            if (choose < 0 || choose > 3) {
                System.out.println("Lua chon khong hop le! Vui long chon lai.");
            }
        } while (choose < 0 || choose > 3);
        if (choose == 1) {
            System.out.println("Gioi tinh: Nam");
        } else if (choose == 2) {
            System.out.println("Gioi tinh: Nu");
        } else if (choose == 3) {
            System.out.println("Gioi tinh: Khac");
        }

        System.out.print("Nhập mức lương cơ bản: ");
        basicSalary = sc.nextDouble();

        System.out.print("Nhập điểm trung bình tốt nghiệp đại học (thang điểm 10): ");
        graduationScore = sc.nextDouble();
    }

    public static void displayInfo(){
        System.out.println("\nThông tin nhân viên:");
        System.out.println("Họ tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Mức lương cơ bản: " + basicSalary);
        System.out.println("Điểm trung bình tốt nghiệp đại học: " + graduationScore);
    }

}
