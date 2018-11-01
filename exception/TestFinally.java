public class TestFinally {
	public static void main(String[] args){
//		finally syntax
//		try{
//			System.out.println(5/0);
//		}finally{
//			System.out.println("This is finally");
//		}
		
//		Another finally syntax
		try{
			//System.exit(-1); //jvm exits; This is the only way to prevent execute finally block;
			System.out.println(5/0);
			return;			
		}catch(ArithmeticException e){
			e.printStackTrace();
		}finally{
			System.out.println("This is finally");//The content in finally would be executed no matter what you have written above this block;
		}
	}

}
