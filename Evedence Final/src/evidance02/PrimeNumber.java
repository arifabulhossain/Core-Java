
package evidance02;

import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer :");
        int x = input.nextInt();
        for (int i = 2; i <x; i++) {
            if(x % i == 0){
            count++;
            break;
            
            }
        } 
        
        if(count==0){
        
        System.out.println("Is a prime number");
        } else {
        
        System.out.println("Is not a prime number");
        }
    }
    
    
}
