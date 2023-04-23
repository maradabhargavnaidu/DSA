package BasicMathsProblems;

import java.util.*;

public class ReverseNumber {
    static void ReverseTheNumber(int n) {
        int reverse = 0;
        while (n != 0) {

            int endDigit = n % 10;
            reverse = reverse * 10 + endDigit;
            n = n / 10;
        }
        System.out.println(reverse);
        System.out.println(reverse / 10);
    }

    static void reverse(int x) {
        long finalNum = 0;
        while (x != 0) {
            int lastDig = x % 10;

            finalNum = finalNum * 10;
            finalNum += lastDig;
            x = x / 10;
        }
        // finalNum = finalNum / 10;
        if (finalNum > Integer.MAX_VALUE || finalNum < Integer.MIN_VALUE) {
            System.out.println("0");
        }
        if (x < 0) {
            // return (int) (-1 * finalNum);
            System.out.println(-1 * finalNum);
        }
        System.out.println(finalNum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = input.nextInt();
        // ReverseTheNumber(n);
        reverse(n);
    }
}
