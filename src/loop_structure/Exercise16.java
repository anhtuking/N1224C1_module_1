package loop_structure;

public class Exercise16 {
    public static void main(String[] args) {
        int n = 5;

        // hinh a
        System.out.println("hinh a");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i >= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // hinh b
        System.out.println("hinh b");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // hinh c
        System.out.println("hinh c");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // hinh d
        System.out.println("hinh d");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // hinh e
        System.out.println("hinh e");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i == j || j == 1 || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // hinh f
        System.out.println("hinh f");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // hinh g
        System.out.println("hinh g");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= j) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
