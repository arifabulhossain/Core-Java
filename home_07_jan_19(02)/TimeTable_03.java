/*
 
 */
package home_07_jan_19.pkg02;

import java.util.Scanner;

public class TimeTable_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, i;
        System.out.println("Enter the number ");
        number = input.nextInt();
        for (i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
        
        
    }

}
