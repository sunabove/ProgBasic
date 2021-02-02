package lec.oo_exam;

public class TestCode {

	public static void main(String[] args) { 
		// Person person ; // 선언
		// person = new Person(); // 정의 
		
		//Person person = new Person();
		
		Animal animal;
		// animal = new Animal(); // 에러
		animal = new Person(); // 하위 클래스로 정의
		
		var out = System.out;
		
		//Animal person = new Person(); 
		//Person person = new Person( "John" );
		var person = new Person( "John" );
		
		int allCount = Animal.ALL_COUNT ; 
		allCount = person.ALL_COUNT ; 
		
		out.printf( "allCount = %d\n", allCount );
		
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
