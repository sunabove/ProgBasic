package lec.net_05_room;

public enum AnsiColor {
	ANSI_RESET("\\u001B[0m"),
	ANSI_BLACK("\\u001B[30m"),
	ANSI_RED("\\u001B[31m"),
	ANSI_GREEN("\u001B[32m"),
	ANSI_YELLOW("\u001B[33m"),
	ANSI_BLUE("\u001B[34m"),
	ANSI_PURPLE("\\u001B[35m"),
	ANSI_CYAN("\u001B[36m"),
	ANSI_WHITE("\u001B[37m"),
    ;
	
	/*
	 * 	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	 */

    private final String text; 
    
    AnsiColor(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}