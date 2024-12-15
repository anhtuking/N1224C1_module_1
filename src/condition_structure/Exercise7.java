package condition_structure;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tham nien cong tac: ");
        int tnct = sc.nextInt();
        double basic_salary = 650000;

        double coefficient;

        if (tnct < 12) {
            coefficient = 1.92;
        } else if (tnct < 36) {
            coefficient = 2.34;
        } else if (tnct < 60) {
            coefficient = 3;
        } else {
            coefficient = 4.5;
        }

        double salary = basic_salary * coefficient;
        System.out.println("Employee salary is: " + salary);
    }
}
