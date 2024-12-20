package method;

import java.util.Scanner;

public class Exercise6 {
    public static String name;
    public static int age;
    public static String gender;
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

        System.out.print("Nhập giới tính: ");
        gender = sc.nextLine();

        System.out.print("Nhập mức lương cơ bản: ");
        basicSalary = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập điểm trung bình tốt nghiệp đại học (thang điểm 10): ");
        graduationScore = Double.parseDouble(sc.nextLine());
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
