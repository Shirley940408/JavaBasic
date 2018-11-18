import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * properties class for reading .properties format 
 */
public class ConfigFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties=new Properties();
		try {
			properties.load(new FileInputStream("db.properties"));
			System.out.println(properties.getProperty("username"));
			System.out.println(properties.getProperty("password"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}