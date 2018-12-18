/*
 String er joono nextLine Method dite hobe.
 */
package home_18_dec_18;

import java.util.Scanner;


public class ScannerType_string {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter Your Name : ");
        name = input.nextLine();
        System.out.println("Welcome!!! ");
        System.out.println(name);
    }
}
