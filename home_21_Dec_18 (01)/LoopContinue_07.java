/*
 print 1 to 10 expect 5 and 6;
 */
package Home_21_Dec_18;


public class LoopContinue_07 {
    public static void main(String[] args) {
         for (int x = 1; x <= 10; x = x +1) {
            if (x == 5) {
                continue;
            } else if (x == 6) {
                continue;
            }
            System.out.println(x);
        }
    }
    
}
