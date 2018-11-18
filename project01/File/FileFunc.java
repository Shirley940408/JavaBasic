import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;


public class FileFunc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f0=new File("abc.txt");
		System.out.println(f0.exists());
		f0.createNewFile();
		System.out.println(f0.exists());
		
		File f1=new File("abc/bac");
		f1.mkdirs();
		File f3=new File("bcd");
		f3.mkdirs();
		File f2=new File("bcd","java.txt");
//        File(String directoryPath)
//        File(String directoryPath, String filename)
//        File(File dirObj, String filename)
//		remember to make sure the file Directory exist Before using it
		f2.createNewFile();
		System.out.println(f2.getPath());
		System.out.println(f2.getParent());
		System.out.println(f2.getName());
		System.out.println(f2.getAbsolutePath());
		
		File f5=new File("c:");
		f5.mkdirs();
		System.out.println(f5.getAbsolutePath());
		System.out.println(f5.isDirectory());
		listFile(f1);
//		listFile(f3);
		
	}
	
	private static void listFile(File f){
		File[] files=f.listFiles();
        for (File file :files){
        	System.out.println(file.getName()+"\t\t"+(file.isFile()?"file":"directory")
        +"\t\t"+file.getParent()+"\t\t"+file.getAbsolutePath());
        	if(file.isDirectory()){
        		listFile(file);
        	}
        	
        }
	}

}
