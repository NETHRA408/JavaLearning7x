package ex_200724;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        // write a prgm of leap yr

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the year");
        int n = sc.nextInt();
//        int n = 2024;
        if (n%4 == 0 && n%300 !=0){
            System.out.println("IT's a leap year");
        }
        else {
            System.out.println("not a  leap year");
        }

    }
}
