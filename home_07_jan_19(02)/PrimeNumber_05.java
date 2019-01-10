/*

 */
package home_07_jan_19.pkg02;

import java.util.Scanner;

public class PrimeNumber_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,count = 0;
        System.out.println("Enter a positive integer :");
        number = input.nextInt();
        for (int i = 2; i < number; i++) {
            if(number%i==0){
            count++;
            break;
            }
            
        }
        if(count==0){
            System.out.println("Is a prime number!!!");
        } else {
            System.out.println("Is not prime number!!!");
        
        }
    }
}
