/*
 1*2*3*4.......n;
1*3*5*..........n;
i = i+2;

 */
package home_07_jan_19.pkg02;

import java.util.Scanner;

public class SeriesLoop_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, multi = 1;
        System.out.println("Enter the last value");
        n = input.nextInt();
        for (int i = 1; i <= n; i = i + 1) {
            System.out.print(i + " ");
            multi = multi * i;
        }
        System.out.println(" ");
        System.out.println(multi + " ");
    }

}
