package lec.regular;

import java.util.regex.*;

public class RegEx04 {
	public static void main(String args[]) {
		var out = System.out;
		out.println("? quantifier ....");
		out.println(Pattern.matches("[amn]?", "a"));// true (a or m or n comes one time)
		out.println(Pattern.matches("[amn]?", "aaa"));// false (a comes more than one time)
		out.println(Pattern.matches("[amn]?", "aammmnn"));// false (a m and n comes more than one time)
		out.println(Pattern.matches("[amn]?", "aazzta"));// false (a comes more than one time)
		out.println(Pattern.matches("[amn]?", "am"));// false (a or m or n must come one time)

		out.println("+ quantifier ....");
		out.println(Pattern.matches("[amn]+", "a"));// true (a or m or n once or more times)
		out.println(Pattern.matches("[amn]+", "aaa"));// true (a comes more than one time)
		out.println(Pattern.matches("[amn]+", "aammmnn"));// true (a or m or n comes more than once)
		out.println(Pattern.matches("[amn]+", "aazzta"));// false (z and t are not matching pattern)

		out.println("* quantifier ....");
		out.println(Pattern.matches("[amn]*", "ammmna"));// true (a or m or n may come zero or more times)

	}
}