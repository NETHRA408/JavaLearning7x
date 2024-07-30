package ex_140724;

public class lab15 {
    public static void main(String[] args) {
        //sub of two values

        int a = 10;
        int b = --a;
        System.out.println(b); //9

        int v = 10;
        int m = v--;
        System.out.println(m); // 10
        System.out.println(v); // 9

        System.out.println(a + --a + --a + a-- + a + ++a + a++ +a );
        //                 9 + 8 + 7 + 7 + 6 + 7 + 7 + 8
    }
}
