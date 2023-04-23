package BasicMathsProblems;

import java.util.*;

public class HCF {
    static void HighestCommonFactor(int N1, int N2) {
        if (N1 % N2 == 0) {
            System.out.println("Highest Common Factor" + N2);
        } else {
            System.out.println("Highest Common Factor" + N1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number One:");
        int N1 = input.nextInt();
        System.out.println("Enter Number Two:");
        int N2 = input.nextInt();
        HighestCommonFactor(N1, N2);
    }
}
