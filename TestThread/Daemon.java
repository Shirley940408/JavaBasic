public class Daemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new Processor01();
		Thread t1=new Thread(r1,"t1");
		t1.setDaemon(true);
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" , "+i);
		}
		System.out.println("main thread over");

	}

}
class Processor01 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+" , "+i);
		}
		
	}
	
}
