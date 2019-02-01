/*
 
 */
package practise02;

import java.util.Scanner;

/**
 *
 */
public class PrintPrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting Number");
        int sn = input.nextInt();
        System.out.println("Enter the ending Number");
        int en = input.nextInt();
        int count = 0;
         int total = 0;

        for (int i = sn; i <= en; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
                total++;
            }
            count = 0;

        }
        System.out.println("Total primes:" + total);
    }

}
