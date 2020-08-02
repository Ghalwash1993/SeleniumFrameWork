package ghuru;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utils {
	
	public static String geturlprp(String key) throws IOException
	{

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\Documents\\testframework\\SeleniumFrameWork\\src\\test\\java\\chrome.properties");
		prop.load(fis);
		return prop.getProperty(key);


	}

}
