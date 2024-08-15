package ex_200724;

import java.util.Scanner;

public class lab28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //class
        System.out.println("Enter the number");
        int i = sc.nextInt(); //INT -- assigns the value to i

        if(i%2 ==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}
