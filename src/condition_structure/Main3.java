package condition_structure;

public class Main3 {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        int max;
        if (a > b){
            max = a;
        } else {
            max = b;
        }

        int max2 = (a > b) ? a : b;

        int max3 = Math.max(a, b);
    }
}
