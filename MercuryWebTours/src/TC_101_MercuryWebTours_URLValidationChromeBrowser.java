import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*****************************************************************************
//Test Name: TC_101_PHP_Travels_URLValidation_ChromeBrowser
// Test Description: User should able to navigate to the home page of the application using valid URL
// Test Engineer: EAMY
//Date : 7/27/2020
//Review History:
//***********************************************************************************/



public class TC_101_MercuryWebTours_URLValidationChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe");
		
		// Instantiate a browser class
		
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the follwing URL
		
			driver.get("http://demo.guru99.com/test/newtours/");
		
			System.out.println("my name is khan ");
			
			System.out.println(driver.getCurrentUrl());
			
			String Myurl;
			Myurl= driver.getCurrentUrl();
			System.out.println(Myurl);
	
	    System.out.println(driver.getTitle());
	    
	    //Capture source code from Aut and print those the console window
	    String MySoursecode;
	    MySoursecode = driver.getPageSource();
	    System.out.println(MySoursecode);
	    
	    
	System.out.println(driver.getPageSource());
	   // Close The browser 
        //driver.close();
	// In order to close multiple opened browser 
        //driver.quit();
	}
	
	
	
	
	
	
	

}
