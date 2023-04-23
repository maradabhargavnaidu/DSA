package BasicMathsProblems;

import java.util.*;

public class CountDigitsEvenlyDivides {
    // FIRST SOLUTION
    static void countDigits(int N) {
        int k = N;
        int count = 0;
        while (N < 0) {
            N = N % 10;
            System.out.println(N);
            if (k % N == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    static int evenlyDivides(int N) {
        // code here
        int k = N;
        int count = 0;
        while (N > 0) {
            if (N % 10 != 0 && k % (N % 10) == 0) {
                count++;
            }
            N = N / 10;

        }
        return count;
    }

    // SECOND SOLUTION
    static void stringCountDigits(int n) {
        int count = 0;
        String k = Integer.toString(n);
        System.out.println(k.length());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        countDigits(n);
        stringCountDigits(n);
        evenlyDivides(n);
    }
}
