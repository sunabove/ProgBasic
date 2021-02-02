package thread;

class TwoThreadsTest {
	public static void main(String[] args) {
		new SimpleThread("John").start();
		new SimpleThread("Brown").start();
	}
}