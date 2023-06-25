package week1.day2;

import java.util.Iterator;

public class LearnForLoop {

	public static void main(String[] args) {
		int num = 30;
		for (int i = 0; i <= num; i++) {
			if(i>=10) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("*******");
		for (int i = num; i >= 2; i--) {
			System.out.println(i);
		}
	}
}
