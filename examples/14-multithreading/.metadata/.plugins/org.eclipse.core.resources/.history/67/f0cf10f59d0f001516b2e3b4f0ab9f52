class BlockTable{  
  
 void printTable(int n){  
	 synchronized(this){//synchronized block  
		 for(int i=1;i<=5;i++){  
			 System.out.println(n*i);  
			 try{  
				 Thread.sleep(400);  
			 }catch(Exception e){System.out.println(e);}  
		 }  
	 } 
	 System.out.println("Test");
 }
}  

class MyThread3 extends Thread{  
	BlockTable table;  
	MyThread3(BlockTable table){  
		this.table=table;  
	}  
	public void run(){  
		table.printTable(5);  
	}  
  
}  
class MyThread4 extends Thread{  
	BlockTable table;  
	MyThread4(BlockTable table){  
		this.table=table;  
	}  
	public void run(){  
		table.printTable(100);  
	}  
}  
  
public class SynchronizedBlock{  
	public static void main(String args[]){  
		BlockTable obj = new BlockTable();
		MyThread3 t3=new MyThread3(obj);  
		MyThread4 t4=new MyThread4(obj);  
		t3.start();  
		t4.start();  
	}  
}  