package week1.day3Homework;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] a = {14, 12, 13, 11, 15, 11, 14, 18, 16, 17, 19, 18, 17, 20};
		Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		//int length = a.length;
		System.out.println("Duplicate Numbers are:");
		for(int i=0; i < a.length-1; i++) {
			if(a[i]==a[i+1]) {
				System.out.println(a[i+1]);	
			}
		}
	}

}
