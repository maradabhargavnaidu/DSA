import java.util.Scanner;



public class AllPatterns{
// RECTANGLE OR SQUARE
static void PatternRectangle(int n){
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print("*");
}
System.out.println("");
}
}
// TRIANGLE PATTERN
static void PatternTriangle(int n){
for(int k=0;k<=n;k++){
for(int l=0;l<k;l++){
System.out.print("*");
}
System.out.println("");
}
}

// NUMBERS TRIANGLE
static void PatternNumbersTriangle(int n){
	for(int i=0;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j);
	}
	System.out.println("");
}
}
static void PatternNumberTriangle(int n){
	for(int i=0;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print(i);
	}
	System.out.println("");
}
}
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter Number:");
int N = input.nextInt();
PatternRectangle(N);
PatternTriangle(N);
PatternNumbersTriangle(N);
PatternNumberTriangle(N);
}
}