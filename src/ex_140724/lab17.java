package ex_140724;

public class lab17 {
    public static void main(String[] args) {
        /*JVM has cls loaders , Heap , string constant pool (SCP)
        new stings are stored in heap area in JVM
         */
        String s1= "mikki"; // stores in SCP
        String s2 = s1;
        System.out.println(s2);
        String s3 = "blacki";
        System.out.println(s3);

        // nethra
        String name = new String("nethra"); // stores in heap area
        System.out.println(name);
        // concatenate
        System.out.println("hello " + name);  //for space b/w the name we have add space



    }
}
