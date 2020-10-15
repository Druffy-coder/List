package Withlist;

public class Main {
    public static void main(String[] args) {
        List a = new List();
        a.add(12);
        a.add(24);
        a.add(36);
        a.add(80);
        a.add(35);
        a.add(98);
        System.out.println(a.indexAt(3).toString());
        System.out.println();
        System.out.println(a.toString());
        a.swap(2, 4);
        System.out.println(a.toString());
        a.swap(0, 3);
        System.out.println(a.toString());
        a.swap(-30, 80);
        System.out.println(a.toString());
        a.swap(5, 0);
        System.out.println(a.toString());
        a.sort();
        System.out.println(a.toString());
    }
}

