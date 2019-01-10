/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_08_jan_19.pkg01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PrintPrime_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, count = 0;
        System.out.println("Enter an Initial value :");
        m = input.nextInt();
        System.out.println("Enter an Ending value :");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
                count = 0;
            }

        }

    }

}
