package Recursion;

import java.util.*;

public class Printing {
    static void recursiveFunction(int N) {
        recursiveFunction(N);
        N++;
        System.out.println(N);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        recursiveFunction(N);
    }
}
