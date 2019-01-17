/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printsum;

/**
 *
 * @author User
 */
public class PrintSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i ;
            System.out.println(i);
        }
        System.out.println("The sum is : "+sum);
    }
    
}
