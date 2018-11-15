/**
 * The difference between sleep and yield
 * sleep():guaranted that during the sleeping time the current Thread would not be started,
 * but it might allow all the prorities without consider their orders have the chances to start. 
 * yield():a restart function for the current thread, thus, it might be start continuously after the yield method. 
 * Plus, yield() would only allow the thread who has the same priorites have the chance to start.
 */
public class ThreadYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new TheThirdProcessor();
		Thread t1=new Thread(r1,"t1");
		t1.start();
		Thread t2=new Thread(r1,"t2");
		t2.start();
	}

}
class TheThirdProcessor implements Runnable{

		public void run() {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName()+" , "+i);
				if(i%10==0){
					System.out.println("--------");
					Thread.yield();
				}
				
			}
		}

}
