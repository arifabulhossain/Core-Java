/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r,temp,num,sum = 0;
        System.out.println("Enter a Number");
        num = input.nextInt();
        temp = num;
        while(temp!=0){
        r = temp % 10;
        sum = sum*10 + r;
        temp = temp/10;
        
        }if(num==sum){
         System.out.println("The number is palandrome ");
        
        }else {
        System.out.println("The number is not palandrome ");
        
        }
        
    }
}
