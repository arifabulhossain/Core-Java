/*
 
 */
package home_19_dec_18_.pkg2;

import java.util.Scanner;

public class IfCondition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter A Number : ");
        num = input.nextInt();
        if (num > 0) {

            System.out.println("The Result is \"Positive\" ");
        } else if (num < 0){
         System.out.println("The Result is \"Negative\" ");
          System.out.println(" \"Fine!!!\" ");
        }
        
        
        else {
       
         System.out.println("The Result is \"Zero\" ");
           System.out.println(" \"Good\" ");
        
        }
    }  


}
