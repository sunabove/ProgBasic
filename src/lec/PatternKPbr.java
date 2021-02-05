package lec;

public class PatternKPbr {
	// 박보람 작성

	public static void main(String[] args) {
		int n = 12345679;

		for (int i = 1; i < 10; i++) {
			System.out.println(String.format("%d ● %2d = %,d", n, i * 9, n * i * 9));
		}
	}

}
