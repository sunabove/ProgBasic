package lec;

public class VarArgsExampleAnother {
	
	static void display() {
		display( new String [] {} );
	}
	
	static void display(String one) {
		display( new String [] {one} );
	}
	
	static void display(String one, String two) {
		display( new String [] {one, two} );
	}
	
	static void display(String one, String two, String three) {
		display( new String [] {one, two, three} );
	}
	
	static void display(String one, String two, String three, String four) {
		display( new String [] {one, two, three, four} );
	}
	
	static void display(String [] values) {
		for (String s : values ) {
			System.out.print(s + ", ");			
		}
		
		System.out.println();
	}

	public static void main(String args[]) {
		display();// zero argument
		display("hello");// one argument
		display("my", "name", "is", "varargs");// four arguments
	}
}