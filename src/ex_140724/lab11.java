package ex_140724;

public class lab11 {
    public static void main(String[] args) {
        //type casting --sourec and destination
        // widening --converts lower to higher type safe conversation
        short a = 3;
        int b = a;  //Implicit
        System.out.println(b);

//        Narrowing ---converts higher to lower
        long k = 300;
        int l = (int)k;
              //Explicit casting.......
        System.out.println(l);

        int o = 300;
        byte j = (byte)o;
        System.out.println(j);
        /*int a=300; -> int means 32 bits memory required
        0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0
        byte b1=(byte)a; -> byte means 8 bits memory required
        0 0 1 0 1 1 0 0
        Value is
        0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = 44.*/


    }
}
