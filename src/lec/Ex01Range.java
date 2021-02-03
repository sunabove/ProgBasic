package lec;

import java.util.stream.IntStream;

public class Ex01Range {

	public static void main(String[] args) {
		IntStream.range(0, 10).forEach(n -> {
			System.out.println(n);
		});
	}

}
