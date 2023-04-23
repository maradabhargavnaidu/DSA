package BasicMathsProblems;

import java.util.*;

public class Divisors {
    static void DivisorsList(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Num:");
        int n = input.nextInt();
        DivisorsList(n);
    }
}
