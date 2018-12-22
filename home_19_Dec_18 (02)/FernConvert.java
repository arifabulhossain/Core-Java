/*
Ferhenhite to Celcies:

  C = 5 /9 (F-32);
 */
package home_19_dec_18_.pkg2;

import java.util.Scanner;

public class FernConvert {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //double fern , cels;
        System.out.println("Enter The Value");
        double fern = input.nextDouble();
        double cels = 0.55 * (fern - 32);
        System.out.println("The Result is :" + cels);
    }

}
