/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_08_jan_19.pkg01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FibonacciPrint_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n= input.nextInt();
        int first = 0;
        int second = 1;
        int fibo;
        System.out.print(first+" "+second);
        for (int i = 3; i <= n; i++) {
            fibo = first+ second;
            System.out.print(" "+fibo);
            first = second;
            second = fibo;
           
        }
        System.out.println(" ");
    }
}
