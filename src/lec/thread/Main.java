package lec.thread;

public class Main implements Runnable {
	
	public static void main( String [] args ) {
		Main runnable = new Main(); // 실행할 코드 
		
		Thread thread = new Thread( runnable);
		thread.start();
		// 
		System.out.println( "This code is outside of the thread." );
	}

	@Override // Annotation 
	public void run() {
		System.out.println( "This code is running inside the thread." ); 
	}
	
}