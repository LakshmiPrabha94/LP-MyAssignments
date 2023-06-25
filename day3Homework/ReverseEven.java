package week1.day3Homework;

public class ReverseEven {

	public static void main(String[] args) {
		
			String a = "I am a Software Tester";
			String b[]=a.split(" ");
			for(int i=0; i<b.length; i++) {
				String words = b[i];
				if(i%2!=0) {
					char[] letters = words.toCharArray();
					for(int j=letters.length-1; j>=0; j--) {
						System.out.print(letters[j]);
					}
					System.out.print(" ");
				}
				else {
					System.out.print(words+" ");
				}
			}

	}
}