package lec.oo_exam;

public class Person extends Animal { // 사람 
	
	void sleep() { // 잠을 잔다.
		this.bloodPressure = 90 ; 
	}
	
	void drink() {
		this.bloodPressure += 10;
		
		if( this.bloodPressure > 130 ) {
			this.die();
		}
	}

}
