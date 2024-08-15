package ex_200724;

public class lab34 {
    public static void main(String[] args) {
        // JDK > 13

        int itemCode = 001;

        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!"); //short cut
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
    }
}}
