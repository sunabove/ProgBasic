package lec;

public class VarArgsExample {

	static void display(String ... values ) {
		//System.out.println("display method invoked.");
		
		for (String s : values) {
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