package seleniumPackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCloseNewsSources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class. 
		
	        WebDriver browserObject = new ChromeDriver();
	        
	       
		// 3. Open the https://www.washingtonpost.com/ link using get method.
	        browserObject.get("https://www.washingtonpost.com/");
	    //    browserObject.close();
	    // 4. Initialize Second Webdriver object through ChromeDriver class. 
	     //   WebDriver browserObject2 = new ChromeDriver();
	    // 5. Open the https://www.cnn.com/ link using get method.    
	       browserObject.get("https://www.cnn.com/");
	        
	        //String click = Keys.chord(Keys.CONTROL, "t");
	        //browserObject.get(click);
	        //browserObject.get("https://www.cnn.com/");
	        
	        browserObject.close();
	}

}
