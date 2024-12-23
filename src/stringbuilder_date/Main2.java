package stringbuilder_date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // date time formatter

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter birthday (dd/MM/yyyy): ");
        String s = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(s, formatter);
        date = date.plusMonths(1);

        System.out.println(date.format(formatter));
    }
}
