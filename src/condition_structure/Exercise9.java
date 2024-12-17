package condition_structure;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot ky tu: ");
        char character = sc.next().charAt(0); //lấy ký tự đầu tiên từ chuỗi vừa nhập.
        // kiểm tra xem ký tự nhập vào có phải là chữ cái hay không.
        if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
            if (character >= 'a' && character <= 'z') {
                character -= 32; // dựa theo bảng mã ASCII, chữ thường trừ 32 => chữ hoa
            } else {
                character += 32; // +32 chữ hoa => chữ thường
            }
            System.out.println("Sau khi chuyen doi: " + character);
        } else {
            System.out.println("Nhap sai! Vui long nhap lai");
        }
    }
}
