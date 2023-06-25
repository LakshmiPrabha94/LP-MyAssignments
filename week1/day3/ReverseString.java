package week1.day3;
import java.util.Arrays;
public class ReverseString {

	public static void main(String[] args) {
		String a = "Amazon";
		System.out.println("Given String : " + a);
		
		System.out.println("Lower Case : " + a.toLowerCase());
		
		System.out.println("Upper Case : " + a.toUpperCase());
		
		System.out.println("Replace : " + a.replace("Ama", "$"));
		
		int length = a.length();
		System.out.println("String Length : " + length);
		char[] b = a.toCharArray();
		
		for(int i= b.length-1; i>=0; --i) {
			System.out.print(b[i] + " ");
		}

	}

}
