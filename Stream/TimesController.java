public class TimesController {
	public static void main(String[] args){
		code();
		//decode();
	} 
	public static void decode(){
		try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream("trial"+File.separator+"config.txt"));
			){
			
			int temp=bin.read();
			int count=temp^66;
			if(count>0&&count<=3){
				
				System.out.println("Your input times remains "+count+" times");
				count--;
				try(BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("trial"+File.separator+"config.txt"));){
					bout.write(count^66);
				}catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}else{
				System.out.println("Your input time has been limited, please contact customer service to seek help");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void code(){
		try(BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream("trial"+File.separator+"config.txt"));
) {
			bout.write(3^66);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
