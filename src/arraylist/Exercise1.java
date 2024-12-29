package arraylist;

import java.util.*;

public class Exercise1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập n phần tử: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        input(n, list);
        output(list);
        System.out.println();
        System.out.println("Số phần tử lẻ: " + countLe(list));
        System.out.print("Nhập phần tử k cần tìm: ");
        int k = sc.nextInt();
        System.out.println("Vị trí cần tìm trong mảng: " + check(list, k));
        System.out.println("Mảng tăng dần:" + tangDang(list));
        System.out.println("Đảo mảng:" + daoMang(list));
        System.out.print("Nhập phần tử cần xóa: ");
        int rm = sc.nextInt();
        System.out.println("Mảng sau khi xóa: " + xoaK(list, rm));
        System.out.println("Phần tử lớn nhì mảng: " + lonNhi(list));


    }

    private static void output(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static void input(int n, ArrayList<Integer> list) {
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
    }

    // đếm lẻ
    private static int countLe(ArrayList<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // tìm phần tử K
    private static ArrayList check(ArrayList<Integer> list, int k) {
        ArrayList temp = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == k) {
                temp.add(i);
            }
        }
        return temp;
    }

    // mảng tăng dần
    private static ArrayList tangDang(ArrayList<Integer> list) {
        Collections.sort(list);
        return list;
    }

    // đảo mảng
    private static ArrayList daoMang(ArrayList<Integer> list) {
        Collections.reverse(list);
        return list;
    }

    // xóa phần tử nhập từ bàn phím
    private static ArrayList xoaK(ArrayList<Integer> list, int k) {
        list.removeAll(List.of(k));
        return list;
    }

    private static void minMax(ArrayList<Integer> list) {
        int max = Collections.max(list);
        int min = Collections.min(list);
    }

    private static int lonNhi(ArrayList<Integer> list) {
        tangDang(list);
        daoMang(list);
        list.removeFirst();
        return list.getFirst();
    }
}
