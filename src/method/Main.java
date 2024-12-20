package method;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        int z = 5;
        int tong = tinhtong(a , b);
        tong = tinhtong(z, tong);
        System.out.println("Tong= " + tong);
    }

    public static int tinhtong(int a, int b) {
       int  c = a + b;
       return c;
    }
}
