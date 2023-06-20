package week1.day2HomeworkAssignments;

public class Hw4Fibonacci {
	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 1;
		int sum;
		int n =8;
		for(int i=1; i<=n;i++) {
			System.out.print(firstNum + " ");
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
	}
}
