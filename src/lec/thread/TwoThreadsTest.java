package lec.thread;

class TwoThreadsTest {
	public static void main(String[] args) {
		
		// new SimpleThread("John").start();
		// new SimpleThread("Brown").start();
		
		// Thread 생성 
		var threads = new java.util.ArrayList<Thread>();
		
		for( int i = 0; i< 20 ; i ++ ) {
			//threads.add( new SimpleThread( "MyThread " + i) );
			
			var thread = new SimpleThread( "MyThread " + i);
			threads.add( thread );
		}
		// -- Thread 생성 
		
		// Thread 시작
		threads.forEach( thread -> { thread.start(); });
		
		// Thread 시작
		/*
		for( var thread : threads ) {
			thread.start();
		}
		*/
		
	}
}