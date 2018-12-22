/*
 
 */
package tsp_19_dec_18;

import java.util.Scanner;


public class ResultScanner {
    
    public static void main(String[] args) {
        int score ;
       Scanner input = new Scanner(System.in);
        System.out.println("Enter A Value :");
        score = input.nextInt();
       if (score >= 90){
           System.out.println("A+");
          
       } else if (score >= 80){
        System.out.println("A");
       } else if (score>= 70){
        System.out.println("B");
       } else if(score >=60){
        System.out.println("C"
                );
       } else {
           System.out.println("F");
       }
}
}
