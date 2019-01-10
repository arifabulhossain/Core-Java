/*
5!= 5*4*3*2*1;
4!= 4*3*2*1;
3!= 3*2*1;
2!= 2*1;
1!=1*1;
 */
package home_07_jan_19.pkg02;

import java.util.Scanner;


public class FactorialSolve_02 {
    public static void main(String[] args) {
        int num, fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        num =input.nextInt();
        for (int i = num; i >= 1; i--) {
            fact = fact*i;
        }
        System.out.println("The factorial "+num+" = "+fact);
        
    }
}
