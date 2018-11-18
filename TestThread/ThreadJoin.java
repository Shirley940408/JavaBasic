public class ThreadJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new AnotherProcessor();
		Thread t1=new Thread(r1,"t1");
		t1.start();
		try{
			t1.join();
			
		}catch(InterruptedException e){
			e.printStackTrace();			
		}
		System.out.println("---main end---");
	}

}
class AnotherProcessor implements Runnable {
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+" , "+i);
		}
	}
}