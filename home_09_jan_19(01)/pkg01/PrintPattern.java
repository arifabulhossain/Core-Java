
import java.util.Scanner;


public class PrintPattern {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Ente the line number : ");
        n = input.nextInt();
        System.out.println("\n\n");
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col);
            }
            System.out.println("");
        }
    }
}
