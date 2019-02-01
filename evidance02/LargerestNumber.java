/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidance02;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LargerestNumber {

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Enter three number ");
        int x = v.nextInt();
        int y = v.nextInt();
        int z = v.nextInt();
        System.out.println("--------------------------------");

        if (x > y && x > z) {
            System.out.println("The first number is large " + x);
        }
        if (y > x && y > z) {
            System.out.println("The second number is large " + y);
        }
        if (z > x && z > y) {
            System.out.println("The third number is large " + z);
        }
        System.out.println(" ");
        if (x < y && x < z) {
            System.out.println("The first number is small " + x);
        }
        if (y < x && y < z) {
            System.out.println("The second number is small " + y);
        }
        if (z < x && z < y) {
            System.out.println("The third number is small " + z);
        }
    }

}
