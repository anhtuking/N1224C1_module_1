package java_overview;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem thi cua hoc sinh.");

        System.out.print("Mon Toan: ");
        double toan = scanner.nextDouble();
        System.out.print("He so mon Toan: ");
        double hsToan = scanner.nextDouble();

        System.out.print("Mon Ly: ");
        double ly = scanner.nextDouble();
        System.out.print("He so mon Ly: ");
        double hsLy = scanner.nextDouble();

        System.out.print("Mon Hoa: ");
        double hoa = scanner.nextDouble();
        System.out.print("He so mon Hoa: ");
        double hsHoa = scanner.nextDouble();

        double diemTB = ((toan * hsToan) + (ly * hsLy) + (hoa * hsHoa)) / (hsToan + hsLy + hsHoa);
        System.out.println("Diem trung binh cua hoc sinh la: " + diemTB);

    }
}
