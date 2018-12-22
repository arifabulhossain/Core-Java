/*
 (double) num1 -  type casting;
 */
package home_19_dec_18;

import java.util.Scanner;

public class OperatorScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.println("Enter 1st Number: ");
        num1 = input.nextInt();
        System.out.println("Enter 2nd Number: ");
        num2 = input.nextInt();
        result = num1 + num2;
        System.out.println("The result is: " + result);

        result = num1 - num2;
        System.out.println("The result is: " + result);

        result = num1 * num2;
        System.out.println("The result is: " + result);

        double result1 = (double) num1 / (double) num2;
        System.out.println("The result is: " + result1);
        
         result =  num1 /  num2;
        System.out.println("The result is: " + result);
        
        

    }
}
