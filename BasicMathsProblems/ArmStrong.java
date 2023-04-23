package BasicMathsProblems;

import java.util.*;

public class ArmStrong {
    static void armStrongNumber(int N) {
        int count = 0;
        int sum = 0;
        int temp = N;
        int original = N;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        int i = 0;
        while (N != 0) {
            int digit = N % 10;
            sum += Math.pow(digit, count);
            N = N / 10;
        }
        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not An ArmStrong");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        armStrongNumber(N);
    }
}
