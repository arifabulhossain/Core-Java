/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_07_jan_19.pkg02;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NestedLoop_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.println("Enter initial number : ");
        m = input.nextInt();
        System.out.println("Enter final number : ");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "X" + j + "=" + i * j);
            }
            System.out.println("\n");
        }
    }
}
