package lec.pattern;

public class PatternF {	
	// 박보람님 작성

	public static void main(String[] args) {
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
