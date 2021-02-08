import lombok.NonNull;

// package 선언이 없는 것은 top package 이다.

public class Abc { 
	
	static int myLen(@NonNull String text) {
		return text.length();
	}

	public static void main(String[] args) {
		int len = myLen( null );
		
		System.out.println( "abc Hello... " + len ); 
	}

}
