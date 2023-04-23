package BasicMathsProblems;

import java.util.*;

public class Palindrome {
    static void palindrome(int n) {
        int reverseNum = 0;
        int temp = n;
        while (n != 0) {

            reverseNum = reverseNum * 10 + (n % 10);
            n = n / 10;
        }
        if (reverseNum == temp) {
            System.out.println("The Entered Number is Palindrome");
        } else {
            System.out.println("The Entered Number is not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        palindrome(n);
    }
}
