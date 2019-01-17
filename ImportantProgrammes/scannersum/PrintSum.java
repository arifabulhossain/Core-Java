/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannersum;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PrintSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter first number : ");
        int m = input.nextInt();
        System.out.println("Enter second number : ");
        int n = input.nextInt();
        for (int i = m; i <= n ; i++) {
            sum = sum + i ;
            System.out.println(i);
        }
        System.out.println("The result is :"+ sum);
    }
}
