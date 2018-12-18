/*

 */
package home_19_dec_18;

import java.util.Scanner;

public class Circle_Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radies, area;
        System.out.println("Enter the Radies");
        radies = input.nextDouble();
        area = 3.1416 * radies * radies;
        System.out.println("The Area of Circle is : " + area);
    }
}
