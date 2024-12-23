package stringbuilder_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        today = today.plusDays(1);
        System.out.println(today);

        LocalTime todayTime = LocalTime.now();
        System.out.println(todayTime);

        LocalDateTime todayDateTime = LocalDateTime.now();
        todayDateTime = todayDateTime.withYear(1);
        System.out.println(todayDateTime);
    }
}
