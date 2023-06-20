package week1.day2HomeworkAssignments;

public class Hw4Fibonacci {
	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 1;
		int sum;
		int n =8;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=2; i<n;i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}
	}
}