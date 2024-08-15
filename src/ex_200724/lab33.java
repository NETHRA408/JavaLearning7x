package ex_200724;

import java.util.Scanner;

public class lab33 {
    // vowels -a e i o u
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the voewl");
        char c = sc.next().charAt(0);


        switch (c) {
            case 'a':
                System.out.println("v");
                break;
            case 'e':
                System.out.println("v");
                break;
            case 'i':
                System.out.println("v");
                break;
            case 'o':
                System.out.println("v");
                break;
            case 'u':
                System.out.println("v");
                break;
            default:
                System.out.println("not v");
        }

        switch (c) {
            case 'a', 'i', 'o', 'u', 'e':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It it Consonant");
        }
    }
}
