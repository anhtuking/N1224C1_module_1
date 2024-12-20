package loop_structure;

public class Exercise23 {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            int a = i % 10;
            int b = i / 10;

            int s = a + b;
            int p = a * b;

            if (p == 2 * s) {
                System.out.println(i);
            }
        }
    }
}
