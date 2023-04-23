import java.util.Scanner;

public class AllPatterns {
	// RECTANGLE OR SQUARE STAR PATTERN
	static void PatternRectangle(int n) {
		// THIS IS OUTER LOOP, TO PRINT HOW MANY ROWS WE WANT
		for (int i = 0; i < n; i++) {
			// THIS IS INNER LOOP, TO PRINT HOW MANY COLUMNS WE WANT
			// THIS IS RECTANGLE PATTERN SO WE PUT EQUAL TO "N"
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	// TRIANGLE PATTERN STAR
	static void PatternTriangle(int n) {
		// OUTER LOOP FOR COLS, WE WANT N COLS
		for (int k = 0; k <= n; k++) {
			// WE WANT TO REPEAT THE INNER LOOP FOR 1 COL 1 TIME AND 2 COLS 2 TIMES SO WE
			// KEEP LESS THAN OUTER LOOP
			for (int l = 0; l < k; l++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	// NUMBERS TRIANGLE PATTERN
	static void PatternNumbersTriangle(int n) {
		// N COLS
		for (int i = 1; i <= n; i++) {
			// SIMILAR TO ABOVE PATTERN BUT PRINTING NO OF COLS HERE J IS STARTING WITH 1
			// BCOZ IF WE START WITH 0 IT WILL PRINT 0 AS FIRST
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	static void PatternNumberTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			// SIMILAR TO ABOVE BUT PRINTING ROW NUMBER
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

	// REVERSE TRIANGLE PATTERN
	static void ReverseTrianglePattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// REVERSE TRIANGLE NUMBER PATTERN
	static void ReverseTriangleNumberPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	// EQUALATERAL TRIANGLE PATTERN
	static void EqualateralTrianglePattern(int n) {
		for (int i = 0; i < n; i++) {
			// SPACES FOR 0TH ROW 4 SPACES SO THE SPACE LOOP MUST RUN 4TIMES
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// FOR I=4 1COL N=5 N-I
	// FOR I=3 3COL
	// FOR I=2 5COL
	// FOR I=1 7COL
	// FOR I=0 9COL

	// REVERSE EQUILATERAL TRIANGLE PATTERN
	static void ReverseEquilateralTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * n - (2 * i + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number:");
		int N = input.nextInt();
		PatternRectangle(N);
		PatternTriangle(N);
		System.out.println();
		PatternNumbersTriangle(N);
		System.out.println();
		PatternNumberTriangle(N);
		System.out.println();
		ReverseTrianglePattern(N);
		System.out.println();
		ReverseTriangleNumberPattern(N);
		System.out.println();
		EqualateralTrianglePattern(N);
		System.out.println();
		ReverseEquilateralTriangle(N);
		System.out.println();
	}
}