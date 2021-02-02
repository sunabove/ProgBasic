package lec.oo_exam;

public class Person extends Animal { // 사람 
	
	// 속성
	
	public Person() { // 생성자, 기본적으로 만들어 짐.
		super(); // 기본적으로 호출이 됨.
	}
	
	public Person(String name) { // 생성자, 기본적으로 만들어 짐.
		super( name ); // 기본적으로 호출이 됨.  
	}
	
	void sleep(int days) { // 잠을 잔다.
		super.sleep(days);
		
		System.out.println( "Person sleep" );
		
		this.bloodPressure = 90 ; 
	}
	
	void drink(Beverage beverage) { // Messaging 
		if( beverage instanceof Sozu) {	
			System.out.println( "drink Sozu" );
			
			this.bloodPressure += 10;
		}else if( beverage instanceof Beer) {
			System.out.println( "drink Beer" );
			
			this.bloodPressure += 5 ;
		}
		
		if( this.bloodPressure > 130 ) {
			this.die();
		}
	}

}
