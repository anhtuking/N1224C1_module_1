package stringbuilder_date;

public class Exercise3 {
    public static void main(String[] args) {

        //a. Ép kiểu không làm mất độ chính xác theo thứ tự tăng dần:
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println(d);

        //b. Ép kiểu không làm mất độ chính xác theo thứ tự giảm dần:
        double d = 100;
        float f =  (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        System.out.println(b);

        //c. Ép kiểu làm mất độ chính xác:
        double d = 999999999.9;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        //d. Phân biệt ép kiểu tường minh và ngầm định:
        // Ép kiểu tường minh
        double d1 = 3.14;
        int i1 = (int) d1;

        // Ép kiểu ngầm định
        byte b = 10;
        int i = b;

        //e.
        // L: long, D: double, F: float, ...
        long bigNumber = 1234567890123L;
        float pi = 3.14159f;
    }
}
