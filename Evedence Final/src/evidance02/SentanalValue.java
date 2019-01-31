
package evidance02;

import java.util.Scanner;


public class SentanalValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum= 0;
        for (int i = 0; ; i++) {
            System.out.println("Enter postive integer");
            int x = input.nextInt();
            if(x!=-1){
            sum = sum + x;
            } else {
            
            break;
            }
        }
        System.out.println("The result is "+sum);
        
    }
    
}
