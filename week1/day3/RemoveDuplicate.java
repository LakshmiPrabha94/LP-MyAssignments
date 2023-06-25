package week1.day3;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] split = text.split(" ");
		for(int i = 0; i<split.length; i++) {
			System.out.print(split[i] + " ");
		}
		

	}

}
