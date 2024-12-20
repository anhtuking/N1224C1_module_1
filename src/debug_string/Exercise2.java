package debug_string;

public class Exercise2 {
    public static void main(String[] args) {

        //a
        String strA = "1000000000";
        int a = Integer.parseInt(strA);
        //int a = Integer.valueOf(strA);

        //b
        int b = 123;
        String strB = String.valueOf(b);

        //c
        String strC = "1234567899876543210";
        long c = Long.parseLong(strC);

        //d
        String strD = String.valueOf(c);

        //e
        String strE = "20.10f";
        float e = Float.parseFloat(strE);

        //f
        String strF = String.valueOf(e);

        //g
        String strG = "26.07d";
        double g = Double.parseDouble(strG);

        //h
        String strH = String.valueOf(g);

        //i
        String strI = "100";
        Short i = Short.parseShort(strI);

        //k
        String strK = String.valueOf(i);
    }
}
