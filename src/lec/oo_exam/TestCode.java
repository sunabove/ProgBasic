package lec.oo_exam;

public class TestCode {

	public static void main(String[] args) { 
		// Person person ; // 선언
		// person = new Person(); // 정의 
		
		//Person person = new Person();
		
		var out = System.out;
		
		Animal person = new Person(); 
		
		person.birth();		
		out.printf( "age = %f, blood=%f\n", person.age.value, person.bloodPressure );
		
		person.sleep();		
		out.printf( "age = %f, blood=%f\n", person.age.value, person.bloodPressure );
		
	}

}
