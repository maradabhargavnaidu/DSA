package BasicMathsProblems;

import java.util.*;

public class Threesum {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);
        // TARGET INPUT
        System.out.println("Enter Target");
        int target = input.nextInt();
        // SIZE OF ARRAY
        System.out.println("Enter ArraySize:");
        int arrSize = input.nextInt();
        int Arr[] = new int[arrSize];
        // TAKING ARRAY INPUTS
        System.out.println("Enter Elements in Array:");
        for (int i = 0; i < arrSize; i++) {
            Arr[i] = input.nextInt();
        }
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    if (Arr[i] + Arr[j] + Arr[k] == target) {
                        int resArr[] = new int[3];
                        resArr[0] = k;
                        resArr[1] = j;
                        resArr[2] = i;
                        System.out.println(Arrays.toString(resArr));
                    }
                }
            }
        }
    }
}
