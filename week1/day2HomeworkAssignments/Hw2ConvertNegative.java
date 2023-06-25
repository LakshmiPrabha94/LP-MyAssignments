package week1.day2HomeworkAssignments;

public class Hw2ConvertNegative {

	public static void main(String[] args) {
		int n = -40;
		if(n<0) {
			n = n * -1;
			System.out.println(n);
		}
		else {
			System.out.println("Try with a negative number");
		}
	}
}
