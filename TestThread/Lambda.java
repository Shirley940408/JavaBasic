public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method Lstub
		Runnable runnable=()->{
			for (int i = 0; i <100; i++) {
				System.out.println("++++++++++++++");
			}
		};
		Thread t1=new Thread(runnable);
		new Thread(()->{
			for (int i = 0; i <100; i++) {
				System.out.println("==============");
			}
		}).start();
	}

}
