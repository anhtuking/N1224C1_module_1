package stringbuilder_date;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Exercise2 {
    public static void main(String[] args) throws ParseException {

        //a Chuyen chuoi 02/28/2023 sang kieu java.util.Date
        String str = "02/28/2023";

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = dateFormat.parse(str);
        System.out.println(date);

        //b Chuyen ngay hien tai dang o dang java.util.Date sang kieu String theo dang dd/MM/yyyy
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formatter.format(today));

        //c Chuyen chuoi 02/28/2023 sang kieu LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(str, formatter);
        System.out.println(localDate);

        //d. Chuyen ngay hien tai dang o kieu LocalDate sang kieu String theo dang dd/MM/yyyy
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);
        System.out.println(formattedDate);

        //e. Lay ngay, thang, nam, gio, phut, giay hien tai
        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println(currentDate);

        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();
        int hour = currentDate.getHour();
        int minute = currentDate.getMinute();
        int second = currentDate.getSecond();

        System.out.printf("Ngay %d thang %d nam %d, %d gio %d phut %d giay.", day, month, year, hour, minute, second);

        //f. Cho biet mot thang sau se la ngay thu may trong tuan va cach ngay hien tai bao nhieu ngay
        LocalDate currentDate = LocalDate.now();
        LocalDate oneMonthsLater = currentDate.plusMonths(1);

        long dayOfOneMonthLater = currentDate.until(oneMonthsLater, ChronoUnit.DAYS);
        // ChronoUnit.DAYS : tinh so ngay chenh lech giua hai thoi diem

        System.out.println("Sau 1 thang " + oneMonthsLater);
        System.out.println("Mot thang sau se roi vao thu " + oneMonthsLater.getDayOfWeek());
        System.out.println("So ngay chenh lech la: " + dayOfOneMonthLater);

        //g. Cho biet cach day 1000days se la ngay thang nam nao
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(1000);
        System.out.println("Ngay thang nam tuong lai: " + futureDate);

        //h. Nhap vao 2 String => chuyen thanh 2 bien kieu LocalDate. Tinh so ngay chech lech giua 2 ngay
        String str1 = "26/07/2003";
        String str2 = "20/10/2003";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(str1, formatter);
        LocalDate localDate2 = LocalDate.parse(str2, formatter);

        long differenceDays = ChronoUnit.DAYS.between(localDate1, localDate2);
        System.out.println("So ngay chenh lech: " + differenceDays);

        //i. Nhap vao 1 String, sau do nhap vao so tu nhien n. In ra ngay sau ngay da nhap n ngay
        String str = "20/10/2003";
        int n = 26;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(str, formatter);
        LocalDate futureDate = localDate.plusDays(n);

        System.out.println("So ngay sau n ngay la: " + futureDate.format(formatter));

    }
}

