/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidance02;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PrintFactorial {
    public static void main(String[] args) {
        int num, fact= 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
         num = input.nextInt();
        for (int i = num; i >= 1; i--) {
             fact =  i*fact;
        }
        System.out.println("The result is :"+fact);
    }
}
