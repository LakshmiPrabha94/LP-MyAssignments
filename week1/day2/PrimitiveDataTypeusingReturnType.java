package week1.day2;

public class PrimitiveDataTypeusingReturnType {
	public int mul(int a, int b) {
		return a*b;
	}
	public int add(int x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
		PrimitiveDataTypeusingReturnType output = new 	PrimitiveDataTypeusingReturnType();
		System.out.println(output.mul(27, 19));
		int result = output.add(5, 550);
		System.out.println(result);

	}

}
