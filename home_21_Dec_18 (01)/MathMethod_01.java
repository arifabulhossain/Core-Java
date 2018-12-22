/*
 
 */
package Home_21_Dec_18;

import java.util.Scanner;

public class MathMethod_01 {

    public static void main(String[] args) {

        int x, y, c, z, result;
        c = 2;
        z = 3;
        x = 16;
        y = 40;
        result = Math.max(x, y);
        System.out.println("Maximum number is " + result);

        result = Math.min(x, y);
        System.out.println("Maximum minimum is " + result);

        int abs = Math.abs(x);
        System.out.println("The Abs value is " + abs);

        double rnd = Math.round(4.8f);
        System.out.println("The round value is " + rnd);
        double power = Math.pow(c, z);
        System.out.println("The power is" + power);
        
        double pi = Math.PI;
         System.out.println("The valu of pi is :" + pi);
    }
}
