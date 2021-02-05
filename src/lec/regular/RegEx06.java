package lec.regular;

/* Create a regular expression that accepts alphanumeric characters only.
 * Its length must be six characters long only.*/

import java.util.regex.*;

public class RegEx06 {
	public static void main(String args[]) {
		var out = System.out;
		out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));// true
		out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));// false (more than 6 char)
		out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));// true
		out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));// false ($ is not matched)
	}
}