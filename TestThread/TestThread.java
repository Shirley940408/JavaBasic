public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new MyThread1();
		
		Thread t2=new MyThread2();
		t1.start();
		t2.start();
	}
	class MyThread1 extends Thread{
		public void run(){
			for(int i=1; i<=1000; i++){
				System.out.println(i+" $$$");
			}
		}
	}
	class MyThread2 extends Thread{
		public void run(){
			for(int i=1; i<=1000; i++){
				System.out.println(i+" ###");
			}
		}
	}

}