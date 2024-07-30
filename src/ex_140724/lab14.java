package ex_140724;

public class lab14 {
    public static void main(String[] args) {
        // addition of both pre and post increments
        int a = 10;
        System.out.println(a++); // exp = 10 a = 11
        System.out.println(++a); // exp = 12 a =12
        System.out.println(a++ + a); // 12+ 13  --- a++ exp= 12 a = 13


        int b= 50;
        System.out.println(++b); // exp=51 b= 51
        System.out.println(b++); // b=52 exp = 51
        System.out.println(++b + b++); // 53 + 53   ----- ++b exp=53 b=53
                                                      //  b++ exp=53 b = 54

        int c = 10;
        System.out.println(c++); // exp = 10 c= 11
        System.out.println(++c); // exp = 12 c= 12
        System.out.println(c++ + c++); // 12 + 13
        System.out.println(++c + c++ + c++); // 15 + 15 + 16
    }
}
