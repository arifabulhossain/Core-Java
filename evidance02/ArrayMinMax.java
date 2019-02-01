
package evidance02;

import java.util.Scanner;


public class ArrayMinMax {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
          int[] number = new int[3];
          System.out.println("Enter three number");
          for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
           int max = number[0];
        int min = number[0];
        for (int i = 1; i < 3; i++) {
            if (max < number[i]) {
                max = number[i];
            }
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("The Maximum : " + max);
        System.out.println("The minimum : " + min);
    }
}
