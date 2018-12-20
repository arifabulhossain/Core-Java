/*
 
 */
package home_19_dec_18_.pkg2;

import java.util.Scanner;

public class VowelConstant_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ltr;
        System.out.println("Enter A letter : ");
        ltr = input.next().charAt(0);
        if (ltr == 'a' || ltr == 'e' || ltr == 'i' || ltr == 'o' || ltr == 'u') {
            System.out.println("Vowel");
            System.out.println("Welcome Arif!!!");
        } else {

            System.out.println("Consonat!!!");
             System.out.println("Welcome Arif!!!");

        }

    }
}
