package lec;

public class ExRecursive {

	static long factorial(int n) {
		if (n < 2) {
			return 1;
		} else {
			return n*factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(factorial(10));
	}

}
