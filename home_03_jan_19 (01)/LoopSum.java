/*
 print Sum 1 to 10;
 */
package home_loop_03_jan_19_.pkg01;

public class LoopSum {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
           
        }
       System.out.println("The result is " + sum);
    }

}
