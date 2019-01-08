/*
 
 */
package home_08_jan_19.pkg01;

import java.util.Scanner;


public class NumberPalandrome {
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
    
    
    
    
    

