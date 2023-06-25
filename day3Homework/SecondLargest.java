package week1.day3Homework;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int[] series = {3,2,11,4,6,9,24};
		System.out.println("");
		System.out.println("Input Series :"+ Arrays.toString(series));
		System.out.println("");
		
		//SORT
		Arrays.sort(series);
		System.out.println("Sorted Series :"+ Arrays.toString(series));
		System.out.println("");
		
		//PRINT
		//int length = series.length;
		//System.out.println(length);
		System.out.println("The second largest num is: " + series[series.length -2]);	
	}
}