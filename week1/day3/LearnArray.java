package week1.day3;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		int[] nos = {2, 5, 7, 7, 5, 9, 2, 3};
		Arrays.sort(nos);
		
		for(int i=0; i<nos.length-1; i++) {
			if(nos[i]==nos[i+1]) {
				System.out.println(nos[i+1]);
			}
		}
	}

}
