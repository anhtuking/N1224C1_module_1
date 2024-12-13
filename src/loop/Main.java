package loop;

public class Main {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < n){
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        } while (i < n);
    }
}
