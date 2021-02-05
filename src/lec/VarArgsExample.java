package lec;

public class VarArgsExample {
	
	// static void display(int i, String ... values , int k) { }
	// 문법적으로 허용이 안 됨. 
	// 고정인자는 가변인자 앞에 와야 함.

	static void display(int i, String ... values) {
		//System.out.println("display method invoked.");
		
		String [] texts = values ;
		
		for (String s : texts ) {
			System.out.print(s + ", ");			
		}
		
		System.out.println();
	}

	public static void main(String args[]) {
		display( 1 );// zero argument
		display( 2, "hello");// one argument
		display( 3, "my", "name", "is", "varargs");// four arguments
	}
}