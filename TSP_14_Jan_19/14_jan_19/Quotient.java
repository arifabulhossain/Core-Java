/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14_jan_19;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Integrs");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num1 + " / "+num2 + " is "+(num1/num2));
        
    }
 
}
