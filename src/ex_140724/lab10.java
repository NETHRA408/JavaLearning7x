package ex_140724;

public class lab10 {
    /* need to remember int int --int    byte byte--int
                        char int--int    char char--int
                        short int--int   float int--float
                        double int-- double  float long--float

     */
    public static void main(String[] args) {
        int r =6;
        char u= 'B'; //66
        int result = r+u;
        System.out.println(result);

        char a1='A'; //65
        char b1='B'; //66
        int h = a1-b1;
        System.out.println(h);

        float i = 8.77f;
        double y = 32.98754845;
        double f = i+y;
        System.out.println(f);

    }
}
