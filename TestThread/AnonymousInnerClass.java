import javax.xml.stream.events.StartDocument;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++) {
					System.out.println("++++++++++++++");
					
				}
			}
			
		};
		Thread t1=new Thread(r);
		t1.start();
		Thread t2=new Thread( new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++) {
					System.out.println("===============");
					
				}
			};
			
		});
		t2.start();
		new Thread( new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++) {
					System.out.println("-----------------");
					
				}
			};
			
		}).start();
	}

}
