/*
Celcies to Ferhenhite:
F = 9 / 5*C +32;
 */
package home_19_dec_18_.pkg2;

import java.util.Scanner;


public class ConvertFern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cels , fern;
        System.out.println("Enter The Value");
        cels = input.nextDouble();
        fern = 1.8 * cels +32;
        System.out.println("The Result is :"+fern);
    }
    
}
