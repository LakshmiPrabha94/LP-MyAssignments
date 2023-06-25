package week1.day2;

public class ForLoopwithIF {

	public static void main(String[] args) {
		int num = 30;
		for(int i = 0; i <= num; i++) {
			if(i%2!=0) {
				if(i==21) {
					//System.out.println(i);
					//break;
					//System.out.println(i);
					continue;
				}
				System.out.println(i);
			}
		}
	}
}
