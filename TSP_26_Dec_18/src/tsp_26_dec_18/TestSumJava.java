/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp_26_dec_18;

/**
 *
 * @author User
 */
public class TestSumJava {

    public static void main(String[] args) {
        float sum = 0;
        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f) {
            sum = sum + i;
           
           System.out.println("The Sum is" + sum);
            
        }
       // System.out.println("The Sum is"+ sum);
    }

}
