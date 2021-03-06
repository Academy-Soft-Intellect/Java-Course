class Table {

	synchronized static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}

class MyThread5 extends Thread {
	public void run() {
		Table.printTable(1);
	}
}

class MyThread6 extends Thread {
	public void run() {
		Table.printTable(10);
	}
}

class MyThread7 extends Thread {
	public void run() {
		Table.printTable(100);
	}
}

class MyThread8 extends Thread {
	public void run() {
		Table.printTable(1000);
	}
}

public class E09_StaticSynchronization {
	public static void main(String t[]) {
		MyThread5 t5 = new MyThread5();
		MyThread6 t6 = new MyThread6();
		MyThread7 t7 = new MyThread7();
		MyThread8 t8 = new MyThread8();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
	}
}