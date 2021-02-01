package my;

public class PatternC {
	
	public static void main(String [] args) {
		
		for (int i = 1; i < 10; i++) {
			for (int j = 9; j > 0; j--) {	
				if(j > i) {
					System.out.print(" ");
				}else {
					System.out.print(j);
				}
			}
			
			for (int j = 2; j < 10; j++) {
				
				if(j > i) {
					System.out.print(" ");
				}else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

}
