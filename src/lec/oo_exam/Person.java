package lec.oo_exam;

public class Person extends Animal { // 사람 
	
	void sleep(int days) { // 잠을 잔다.
		super.sleep(days);
		
		System.out.println( "Person sleep" );
		
		this.bloodPressure = 90 ; 
	}
	
	void drink(Beverage beverage) {
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
