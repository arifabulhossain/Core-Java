/*
 boolean - %b,
char - %c,
intteger - %d,
floating point - %f
 */
package basicjava1;


public class FormatSpecifier {
    public static void main(String[] args) {
         boolean b = true;
         char y = 'b';
         double z = 54236236.576;
         char g = 'a';
         float h = 25.6f;
         int x ;
         x = 67543;
         
         System.out.printf("The Result is: %b\n", b);
          System.out.printf("The Result is: %c\n", g);
           System.out.printf("The Result is: %d\n", x);
          System.out.printf("The Result is: %.3f\n", z);
           System.out.printf("The Result is: %.4f\n", h);
         
    }
}
