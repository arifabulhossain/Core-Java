/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evennumber;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PrintEven {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter first number : ");
        int m = input.nextInt();
        System.out.println("Enter second number : ");
        int n = input.nextInt();
        for (int i = m; i <= n ; i++) {
         // if( i%2==0){
               sum = sum + i ;
           System.out.print(" "+i);
         // }
            
           
        }
       System.out.println(" ");  
        //System.out.println("The result is :"+ sum);
    }
}
