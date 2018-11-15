public class ThreadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new Processor();
		Thread t1=new Thread(r1,"t1");
		t1.start();
		Thread t2=new Thread(r1,"t2");
		t2.start();
	}

}
class Processor implements Runnable{
	public void run() {
		for(int i=0; i<100;i++){
			System.out.println(Thread.currentThread().getName()+","+i);
			if(i%10==0){
				try{
					Thread.sleep(100);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
}