package condition_structure;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot ky tu: ");
        char character = sc.next().charAt(0);

        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
            if (character >= 'a' && character <= 'z') {
                character -= 32;
            } else {
                character += 32;
            }
            System.out.println("Sau khi chuyen doi: " + character);
        } else {
            System.out.println("Nhap sai! Vui long nhap lai");
        }
    }
}
