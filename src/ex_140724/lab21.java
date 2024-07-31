package ex_140724;

public class lab21 {
    public static void main(String[] args) {
        // instance of operator -- similar to boolean
        String pw = "neTHra";
        String result = pw.toLowerCase();
        System.out.printf("%s", result);
//        System.out.println(result);
        System.out.println(pw == result);
        System.out.println(result.equals(pw));
        System.out.println(result.equalsIgnoreCase(pw)); // cuz we can have anything of the name like blacki@123

        System.out.println(pw.replace('A','a'));
        System.out.println(result.replace('a','A'));

        System.out.println(pw.charAt(5));
        System.out.println(result.length());
        System.out.println(pw.indexOf('A'));
        System.out.println(pw.substring(0,4));



    }
}
