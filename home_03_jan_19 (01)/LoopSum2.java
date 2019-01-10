/*
 print even number m to n;
 */
package home_loop_03_jan_19_.pkg01;

import java.util.Scanner;


public class LoopSum2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int sum = 0;
         int m , n ;
         System.out.println("Enter first number ");
         m =input.nextInt();
         System.out.println("Enter second number ");
         n = input.nextInt();
         
        for (int i = m; i <= n; i++) {
           
            if( i % 2 == 0){
            
             sum = sum + i;
                
                System.out.println("   "+i);
                       
            }
           
        }
        System.out.println("The final Result is = "+ sum);
    }
}
