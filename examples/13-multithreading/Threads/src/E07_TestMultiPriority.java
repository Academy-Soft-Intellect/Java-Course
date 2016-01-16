 class E07_TestMultiPriority extends Thread {
	public void run() {
		System.out.println("running thread name is:"
				+ Thread.currentThread().getName());
		System.out.println("running thread priority is:"
				+ Thread.currentThread().getPriority());
	}

	public static void main(String args[]) {
		E07_TestMultiPriority m1 = new E07_TestMultiPriority();
		E07_TestMultiPriority m2 = new E07_TestMultiPriority();
		m1.setPriority(Thread.MAX_PRIORITY);
		m2.setPriority(Thread.MIN_PRIORITY);
		m1.start();
		m2.start();

	}
}