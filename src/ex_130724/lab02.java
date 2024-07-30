package ex_130724;

public class lab02 {
    public static void main(String[] args) {
        // using printf
        int d = 8;
        System.out.printf("%d\n",d);// %d -int . %c -char , %s -string , %f-float

        char c = 'J';
        System.out.printf("%c\n",c);

        float p = 7.11f;
        System.out.println(p);
        System.out.printf("%f\n",p);


        //concatenate
        String s1= "net";
        String s2 ="blacki";
        System.out.println(s1+s2);//

        // one int and string append

        String s4 ="black";
        int a = 2;
        int b = 4;
        System.out.println(a+b+s4);
        System.out.println(s4+a+b);
        System.out.println(a+s4+b);
        System.out.println(a+b+s4+b+s4+a+b);
    }
}
