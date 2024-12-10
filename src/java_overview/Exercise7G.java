package java_overview;

public class Exercise7G {
    public static void main(String[] args) {
        int i = 1;
        int a = i++ + ++i - i-- - --i;

        System.out.println("i = " + i);
        System.out.println("a = " + a);
    }
}
