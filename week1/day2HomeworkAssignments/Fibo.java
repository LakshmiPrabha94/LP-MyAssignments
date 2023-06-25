package week1.day2HomeworkAssignments;
public class Fibo {
	public static void main(String[] args) {
		int n = 8;
		int firstNum = 0, secNum = 1, sum;
		System.out.println("Output of Fibonacci series");
		for(int i=1; i<=n;i++) {
			System.out.print(firstNum + " ");
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;	
		}		
	}
}
