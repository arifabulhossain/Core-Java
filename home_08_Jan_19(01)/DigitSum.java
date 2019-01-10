
import java.util.Scanner;



public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r,temp,num,sum = 0;
        System.out.println("Enter a Number");
        num = input.nextInt();
        temp = num;
        while(temp!=0){
        r = temp % 10;
        sum = sum + r;
        temp = temp/10;
        
        }
        System.out.println("The result is : "+sum);
    }
 
}
