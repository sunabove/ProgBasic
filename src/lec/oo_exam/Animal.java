package lec.oo_exam;

public class Animal { // 동물
	
	// double age ; 
	Age age = new Age() ;  // 나이 
	double bloodPressure = 0 ; // 혈압
	boolean live = true ; // 생존 여부
	
	void birth() { // 태어난다.
		System.out.println( "birth" );
		
		this.age.value = 0 ; 
		this.live = true ;
	}
	
	void sleep() { // 잠을 잔다.
		System.out.println( "sleep" );
		
		this.bloodPressure = 50 ; 
		this.age.value += 1.0/655;
	}
	
	void die() { // 사망한다.
		System.out.println( "die" );
		this.live = false ; 
	}

}
