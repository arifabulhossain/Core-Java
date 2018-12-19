/*
 
 */
package home_19_dec_18_.pkg2;

import java.util.Scanner;

public class Even_Odd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a Positive integer number : ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("------------------------------");
            System.out.println("Even Number");

        } else {
            System.out.println("------------------------------");
            System.out.println("Odd Number");
            System.out.println("                                ");
        }

    }
}
