public class E03_ExecuteThreadTwice extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		E03_ExecuteThreadTwice t1 = new E03_ExecuteThreadTwice();
		t1.start();
		t1.start();
	}
}