package BasicMathsProblems;

import java.util.*;

public class Twosum {
	public static void main(String[] args) {
		// SCANNER
		Scanner input = new Scanner(System.in);
		// TARGET
		System.out.println("Enter the Target:");
		int target = input.nextInt();
		// SIZE OF ARRAY TAKING INPUT FROM USER
		System.out.println("Enter the size of array:");
		int arrSize = input.nextInt();
		// INITIALIZING ARRAY
		int numArr[] = new int[arrSize];
		// INPUT ARRAY
		System.out.println("Enter the values in array:");
		for (int i = 0; i < arrSize; i++) {
			numArr[i] = input.nextInt();
		}
		for (int i = 0; i < arrSize; i++) {
			for (int j = 0; j < i; j++) {
				if (numArr[j] == target - numArr[i]) {
					int[] resArr = new int[2];
					resArr[0] = i;
					resArr[1] = j;
					System.out.println("The Result is");
					System.out.println(Arrays.toString(resArr));
				}
			}
		}
	}
}