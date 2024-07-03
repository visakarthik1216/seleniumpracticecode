package Seleniumsession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	Properties prop;
	
	public Properties initprop()
	{
		try {
			FileInputStream ip= new FileInputStream("./src/main/java/Configuration/config.properties");
			 prop=new Properties();
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return prop;

	}

}
