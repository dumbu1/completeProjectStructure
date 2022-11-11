package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	private static Properties obj_Properties;
	private static FileInputStream obj_FileInputStream;
	
	public static Properties getAllProperties(String propertyFileName) {
		try {
		obj_FileInputStream=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties/"+propertyFileName+".properties");
		obj_Properties=new Properties();
		try {
		obj_Properties.load(obj_FileInputStream);
		}catch(IOException e) {
			System.out.println("data not available in property file");
		}
		}catch(FileNotFoundException e) {
			System.out.println("please check the property file path");
		}
		return obj_Properties;
	}
	
	public static String getPropertyValue(String propertyFileName,String key) {
		
		return getAllProperties(propertyFileName).getProperty(key);
		
	}

}
