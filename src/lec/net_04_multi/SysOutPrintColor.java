package lec.net_04_multi;
// package 선언이 없는 것은 top package 이다.

public class SysOutPrintColor {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static void main(String[] args) {  
		var out = System.out;
		
		out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
		out.println(ANSI_GREEN + "This text is green!" + ANSI_RESET); 
		
	}

}
