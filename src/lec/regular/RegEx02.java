package lec.regular;

import java.util.regex.*;

public class RegEx02 {
	public static void main(String [] args) {
		var out = System.out;
		out.println(Pattern.matches(".s", "as"));// true (2nd char is s)
		out.println(Pattern.matches(".s", "mk"));// false (2nd char is not s)
		out.println(Pattern.matches(".s", "mst"));// false (has more than 2 char)
		out.println(Pattern.matches(".s", "amms"));// false (has more than 2 char)
		out.println(Pattern.matches("..s", "mas"));// true (3rd char is s)
	}
}