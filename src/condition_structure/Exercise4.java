package condition_structure;

public class Exercise4 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;

        if (a == 0) {
            if (b == 0) {
                System.out.println("pt vo so nghiem");
            } else {
                System.out.println("pt vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("pt co nghiem x = " + x);
        }
    }
}
