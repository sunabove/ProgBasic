package lec.oo_exam;

public class TestCode {

	public static void main(String[] args) { 
		// Person person ; // 선언
		// person = new Person(); // 정의 
		
		//Person person = new Person();
		
		var out = System.out;
		
		//Animal person = new Person(); 
		Person person = new Person();
		
		person.birth();		
		out.printf( "age = %f, blood=%.1f\n", person.age.value, person.bloodPressure );
		
		person.sleep( 365 );		
		out.printf( "age = %f, blood=%.1f\n", person.age.value, person.bloodPressure );
		
		person.drink();		
		out.printf( "age = %f, blood=%.1f\n", person.age.value, person.bloodPressure );
		
	}

}
