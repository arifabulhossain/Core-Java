/*
 
 */
package home_19_dec_18;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tringle_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height , area;
        System.out.println("Enter the Base");
        base = input.nextDouble();
        
        System.out.println("Enter the Height");
        height = input.nextDouble();
        
         area = .5 * base * height;
        
        System.out.println("The Area Of Triangle is "+area);
    }
    
}
