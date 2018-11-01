import java.io.FileInputStream;

public class TestException {

	public static void main(String[] args) {
		//m1();
		try {
			m2();
		} catch (SickException e) {
			e.printStackTrace();
		}
//		new FileInputStream(file);
		//Compiling exception are basically used in the situation that we need to check carefully at some point.
	}
	public static void m1(){
		throw new MyException("Runtime exception");
	}
	public static void m2() throws SickException{//compiling exception should be solved during compiling duration
		throw new SickException("Compiling exception");
	}

}