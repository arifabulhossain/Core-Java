/*
 print 1 to 100 except 10 and 16;
 */
package Home_21_Dec_18;

public class LoopContinue_06 {

    public static void main(String[] args) {
        for (int x = 1; x <= 100; x = x + 3) {
            if (x == 10) {
                continue;
            } else if (x == 16) {
                continue;
            }
            System.out.println(x);
        }
    }

}
