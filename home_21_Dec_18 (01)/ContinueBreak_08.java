/*
 
 */
package Home_21_Dec_18;


public class ContinueBreak_08 {
    public static void main(String[] args) {
         for (int x = 1; x <= 10; x = x +3) {
            if (x == 10) {
                continue;
            }  if (x == 13) {
                break;
            }
            System.out.println(x);
        }
    }
}
