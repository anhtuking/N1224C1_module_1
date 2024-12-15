package condition_structure;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        String enl = "";

        switch (n) {
            case 1:
                enl = "One";
                break;
            case 2:
                enl = "Two";
                break;
            case 3:
                enl = "Three";
                break;
            case 4:
                enl = "Four";
                break;
            case 5:
                enl = "Five";
                break;
            case 6:
                enl = "Six";
                break;
            case 7:
                enl = "Seven";
                break;
            case 8:
                enl = "Eight";
                break;
            case 9:
                enl = "Nine";
                break;
            case 10:
                enl = "Ten";
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("So " + n + " viet bang tieng anh la: " + enl);
    }
}
