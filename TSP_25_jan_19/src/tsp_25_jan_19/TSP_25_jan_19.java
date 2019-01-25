/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp_25_jan_19;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TSP_25_jan_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println(" Enter a positive integer ");
        int n = input.nextInt();
        System.out.println("Factorial of " + n +" is "+" = "+factorial(n));
    }
   public static long factorial(int n){
   
   if( n == 0)
       return 1;
   else
       return n*factorial( n-1 );
   }
        
    
}
