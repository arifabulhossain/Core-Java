package evidance02;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("Enter a string or Number ");
        String s1 = y.nextLine();
        StringBuffer sb = new StringBuffer(s1);
        String s2 = sb.reverse().toString();
        if (s1.equals(s2)) {
            System.out.println("Is a palindrome");

        } else {

            System.out.println("Sorry!!! Is not a palindrome");
        }
    }

}
