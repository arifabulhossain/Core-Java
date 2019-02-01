/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidance02;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class ArraySort {

    public static void main(String[] args) {
        int[][] elements = {{10, 50, 15, 30},
        {25, 22, 30, 40},
        {20, 23, 15, 30},
        {45, 30, 40, 44}};
        System.out.println("Display Element");
        for (int[] depo : elements) {
            Arrays.sort(depo);
            for (int main : depo) {
                System.out.print( main + " ");
            }
            System.out.println();
        }
    }
}
