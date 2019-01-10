/*
 Pattern.
 */
package home_09_jan_19.pkg01;

import java.util.Scanner;

public class Home_09_Jan_1901 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Ente the line number : ");
        n = input.nextInt();
        System.out.println("\n\n");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+row);
            }
            System.out.println("");
        }

    }

}
