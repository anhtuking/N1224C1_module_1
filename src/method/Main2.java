package method;

public class Main2 {
    public static void main(String[] args) {
        int a = 2;
        changeData(a);
        System.out.println(a);

    }

    // Tham trị: giá trị không thay đổi khi ra khỏi hàm.
    // Tham chiếu: giá trị thay đổi khi ra khỏi hàm => KH có trong JAVA.

    public static void changeData(int x) {
        x = 11;
    }
}
