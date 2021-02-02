package lec.oo_exam;

public class TestCode {

	public static void main(String[] args) { 
		// Person person ; // 선언
		// person = new Person(); // 정의 
		
		//Person person = new Person();
		
		var out = System.out;
		
		//Animal person = new Person(); 
		//Person person = new Person( "John" );
		var person = new Person( "John" ); 
		
		out.printf( "name = %s\n", person.getName() );
		
		person.birth();		
		out.printf( "age = %.1f, blood=%.1f\n", person.getAge().value, person.bloodPressure );
		
		person.sleep( 365 );		
		out.printf( "age = %.1f, blood=%.1f\n", person.getAge().value, person.bloodPressure );
		
		for( int i = 0 ; i < 10 ; i ++ ) { 
			Beverage sozu = new Sozu();
			person.drink( sozu );		
			out.printf( "age = %.1f, blood=%.1f\n", person.getAge().value, person.bloodPressure );
		}
		
		Beverage beer = new Sozu();
		person.drink( beer );		
		out.printf( "age = %.1f, blood=%.1f\n", person.getAge().value, person.bloodPressure );		
	}

}
