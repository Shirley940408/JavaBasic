public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Runnable runnable=()->{
        	for (int i = 0; i <100; i++) {
				System.out.println(i+Thread.currentThread().getName());
			}
        };
        Thread t1=new Thread(runnable," t1");
        Thread t2=new Thread(runnable," t2");
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
	}

}