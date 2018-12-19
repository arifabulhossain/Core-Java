/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_19_dec_18_.pkg2;

/**
 *
 * @author User
 */
public class Pre_post {

    public static void main(String[] args) {
        int x = 25;
        int y;
        y = --x;  // y = 24
        System.out.println("Y = " + y);
        y = x--; //y = 24;
        System.out.println("Y = " + y);
        y = ++x; // y = 24
        System.out.println("Y = " + y);
        y = x++; // y = 24
        System.out.println("Y = " + y);
        y = x++; // y = 25
        System.out.println("Y = " + y);
         y = ++x; // y = 27
        System.out.println("Y = " + y);
         y = --x; // y = 26
        System.out.println("Y = " + y);
         y = x--; // y = 26
        System.out.println("Y = " + y);
         y = --x; // y = 24
        System.out.println("Y = " + y);
         y = x; // y = 24
        System.out.println("Y = " + y);
        
    }

}
