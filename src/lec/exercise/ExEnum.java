package lec.exercise;

public class ExEnum {
	
	enum Level { LOW, MEDIUM, HIGH };

	public static void main(String[] args) {
		 
		Level myVar = Level.MEDIUM ;
		
		System.out.printf( "myVar = %s\n", myVar );

		for(Level level : Level.values()){
			System.out.println(level + " = " + level.ordinal());
		}  

	}

}
