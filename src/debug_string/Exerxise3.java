package debug_string;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Exerxise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        String a = sc.nextLine();
        System.out.print("Nhap b: ");
        String b = sc.nextLine();

        int compare = a.compareTo(b);
        if (compare == 0){
            System.out.println("a = b");
        } else if (compare < 0) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }
    }
}
