package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configration {
	
	 static Properties pro ;
	 
       public static Properties ReadProperties() {
		
		
		try {
			
			FileInputStream file;	file = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\FrameWork_CuCumber\\src\\test\\resources\\Config.properties");
			 pro = new Properties();
			pro.load(file);
			
		} catch (FileNotFoundException e) {
			
			System.err.println("invalid File  =>"+e.getMessage());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return pro;
	}
	

}
