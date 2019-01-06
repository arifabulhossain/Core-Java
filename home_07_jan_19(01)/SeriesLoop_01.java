/*
 1+2+3+4+....n;
 */
package home_07_jan_19.pkg01;

import java.util.Scanner;

public class SeriesLoop_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Enter the last number :");
        n = input.nextInt();
        for (int i = 1; i <= n; i = i + 1) {
            System.out.print(i + " ");
            sum = sum + i;

        }
        System.out.println("");
        System.out.println(sum);
    }

}
