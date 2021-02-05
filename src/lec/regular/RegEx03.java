package lec.regular;

import java.util.regex.*;

public class RegEx03 {
	public static void main(String args[]) {
		var out = System.out;
		out.println(Pattern.matches("[amn]", "abcd"));// false (not a or m or n)
		out.println(Pattern.matches("[amn]", "a"));// true (among a or m or n)
		out.println(Pattern.matches("[amn]", "ammmna"));// false (m and a comes more than once)
	}
}