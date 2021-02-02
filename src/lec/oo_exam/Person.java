package lec.oo_exam;

public class Person extends Animal { // 사람 
	
	void sleep() { // 잠을 잔다.
		super.sleep();
		
		System.out.println( "Person sleep" );
		
		this.bloodPressure = 90 ; 
	}
	
	void drink() {
		System.out.println( "drink" );
		
		this.bloodPressure += 10;
		
		if( this.bloodPressure > 130 ) {
			this.die();
		}
	}

}