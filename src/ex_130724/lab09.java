package ex_130724;

public class lab09 {
    public static void main(String[] args) {
        int age_m = 4;
        int age_b = 5;
        boolean result = age_b > age_m ;
        System.out.println(result);

         int r= 6;
         int t=9;
        System.out.println(6==6);

       // !not ---revesrse of result
        boolean a = true;
        System.out.println(!a);

        int i =12;                                             //  AND   0 0  0
        boolean y = !(i>10 || i<20);                         //          0 1  0
        boolean p = !(i<8 && i>9);                              //       1 0  0
        System.out.println(p);                               //          1 1  1

    }
}
