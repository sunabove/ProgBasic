package lec.oo_exam;

public class Animal { // 동물
	
	// double age ; 
	Age age = new Age() ;  // 나이 
	double bloodPressure = 0 ; // 혈압
	
	void birth() { // 태어난다.	
		this.age.value = 0 ; 
	}
	
	void sleep() { // 잠을 잔다.
		this.bloodPressure = 50 ; 
	}
	
	void die() { // 사망한다.		
	}

}
