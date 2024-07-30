package ex_140724;

public class lab13 {
    public static void main(String[] args) {
        // Increment and decrement operators
        //pre increment --- value is incremented first then stored
        int a =10;
        int b = ++a;
        System.out.println(b);

        //post increment ---store first then increment

        int c = 33;
        int d = c++;     //upto c the value will be 33 after ++ then the c value will be changed
        System.out.println(d);  //exp = 33 c = 34
        System.out.println(c);  //exp = 33 c = 34
    }
}
