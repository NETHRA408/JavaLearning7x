package ex_130724;

public class lab10 {
    public static void main(String[] args) {
        /*logical operators to construct complex condition
         -- NOT ! , AND && , OR ||
         used b/w boolean values and result is also boolean value

         AND -- if all the condition are true
         OR-- if atleast one condition is true
         */

        boolean b1 = true && true ; // ture
        boolean b2 = b1 && true && false ; //false
        System.out.println(b2); // false

        boolean b3 = b2 || true ; //true
        boolean b4 = !b2;    // false
        boolean b5 = ! (b4 && b2);  // false
        System.out.println(b5); // true

        int a = 33;
        int b = 44;
        boolean y = (a>99 && b< 10 );
                  // false && false ---false
        System.out.println(y);





    }
}
