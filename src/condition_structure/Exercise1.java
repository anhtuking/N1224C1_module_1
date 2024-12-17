package condition_structure;

public class Exercise1 {
    public static void main(String[] args) {

        boolean a = true && false; // dau &&(and) : 1 in 2 false => false
        boolean b = (3 > 100) || (25 % 5 == 0); // dau ||(or) : 1 in 2 true => true
        boolean c = a && b;
        boolean d = !a || b;

        System.out.println(c);
        System.out.println(d);
    }
}
