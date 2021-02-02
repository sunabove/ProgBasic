package lec.oo_exam;

public abstract class Animal { // 동물
	
	static int ALL_COUNT = 0 ; // 클래스 레벨에서 접근 가능

	private String name; // 이름, 객체 레벨에서 접근 가능.
	
	// double age ;
	private Age age = new Age(); // 나이
	protected double bloodPressure = 0; // 혈압
	private boolean live = true; // 생존 여부

	public Animal() { // 생성자, 기본적으로 만들어 짐.
		Animal.ALL_COUNT ++ ;
	}
	
	public Animal(String name) { // 생성자
		this();
		this.name = name;
	}

	void birth() { // 태어난다.
		System.out.println("birth");

		this.age.value = 0;
		this.live = true;
	}

	void sleep(int days) { // 잠을 잔다.
		System.out.println("sleep");

		this.bloodPressure = 50;
		this.age.value += days / 365.0;
	}

	void die() { // 사망한다.
		System.out.println("die");
		this.live = false;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public double getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(double bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	} 
	

}
