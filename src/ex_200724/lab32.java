package ex_200724;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lab32 {

    /** switch for 2+conditions we cab7n use switch
     * syntax---- switch(exp){
     *             cases :
     *              break;
     *              }
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Day is --> monday");
                break;
            case 2:
                System.out.println("tues");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thurs");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("lol");
        }
       // System.out.println("outside the loop");
    }

}
