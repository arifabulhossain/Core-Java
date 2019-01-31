
package evidance02;

import java.util.Scanner;


public class EmailValid {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Enter your Email: ");

        String email = e.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.lastIndexOf(".");

        if (atpos > 1 && (dotpos - atpos) > 2) {
            System.out.println(" Your Email is valid!!!");
        } else {
            System.out.println("Sorry...Email is invalid");
        }
    }

}
