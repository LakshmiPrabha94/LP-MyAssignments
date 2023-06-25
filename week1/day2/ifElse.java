package week1.day2;

public class ifElse {

	public static void main(String[] args) {
		int mark = 460;
		if(mark > 400) {
			System.out.println("Grade of the student : A+");
		}
		else if(mark >350) {
			System.out.println("Grade of the student : B+");
		}
		else if(mark >250) {
			System.out.println("Grade of the student : C");
		}
		else {
			System.out.println("Grade of the student : Reappear");
			System.out.println("Don't loose your Hope");
		}
	}

}
