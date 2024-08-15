package ex_200724;

public class lab31 {
    public static void main(String[] args) {
        if (true) {
            System.out.println("1");  // if false null(ntng) will be printed

            if (false) {
                System.out.println("2");
                if (true) {
                    System.out.println("3");
                }
            }
        }
    }
}