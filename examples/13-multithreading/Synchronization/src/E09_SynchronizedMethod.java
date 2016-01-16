class MethodTable {
	 //void printTable(int n){
	synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread {
	MethodTable table;

	MyThread1(MethodTable table) {
		this.table = table;
	}

	public void run() {
		table.printTable(5);
	}
}

class MyThread2 extends Thread {
	MethodTable table;

	MyThread2(MethodTable table) {
		this.table = table;
	}

	public void run() {
		table.printTable(100);
	}
}

class E09_SynchronizedMethod {
	public static void main(String args[]) {
		MethodTable obj = new MethodTable();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}