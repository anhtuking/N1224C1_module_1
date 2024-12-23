package stringbuilder_date;

public class Exercise1 {
    public static void main(String[] args) {
        String str = "Hello World";

        //a. Lay ra chu World
        StringBuilder stringBuilder = new StringBuilder(str);
        String result = stringBuilder.substring(6);
        System.out.println(result);
        StringBuffer stringBuffer = new StringBuffer(str);
        String redult2 = stringBuffer.substring(6);
        System.out.println(redult2);

        //b. Thay chu "o" thanh chu "f"
        StringBuilder stringBuilder1 = new StringBuilder(str);
        stringBuilder1.replace(4, 5, "f");
        System.out.println(stringBuilder1);

        StringBuffer stringBuffer1 = new StringBuffer(str);
        stringBuffer1.replace(7, 8, "f");
        System.out.println(stringBuffer1);

        //c. Noi hai chuoi "Hello" va "World"
        String str1 = "Hello";
        String str2 = " World";

        String str3 = str1 + str2;
        System.out.println(str3);

        StringBuilder stringBuilder2 = new StringBuilder(str1);
        stringBuilder2.append(str2);
        System.out.println(stringBuilder2);

        StringBuffer stringBuffer3 = new StringBuffer(str);
        stringBuffer3.append(str2);
        System.out.println(stringBuffer3);

        //d. Hien thi ket qua
        String a = "A";
        String b = new String("B");
        String c = "A";

        b.concat("B");
        String d = c.concat("C");
        StringBuffer e = new StringBuffer("E");
        e.append("F");

        StringBuilder g = new StringBuilder("G");
        g.append("H");

        System.out.println(a + b + c + d + e + g);

        //e. Phan biet su khac nhau giua so sanh bang method equals va so sanh bang toan tu ==
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2);       // true
        System.out.println(s1 == s3);       // false
        System.out.println(s1.equals(s3));  // true

        StringBuilder s4 = new StringBuilder("Hello");
        StringBuilder s5 = new StringBuilder("Hello");
        System.out.println(s4 == s5);       // false
        System.out.println(s4.equals(s5));  // false

        StringBuffer s6 = new StringBuffer("Hello");
        StringBuffer s7 = new StringBuffer("Hello");
        System.out.println(s6 == s7);       // false
        System.out.println(s6.equals(s7));  // false
    }
}
