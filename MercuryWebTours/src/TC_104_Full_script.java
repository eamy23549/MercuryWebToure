import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_104_Full_script {

	public static void main(String[] args) {
		
		try {
			
			
		//1. Navigate to the URL,
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		// Maximize the window
		 driver.manage().window().maximize();
	

		//3. Validate the URL.
		
		String ExpectedUrl;
		String ActualUrl;
		
		ExpectedUrl = "http://demo.guru99.com/test/newtours/";
		
		 ActualUrl = driver.getCurrentUrl();
		 
		 boolean URLstutus;
		 
		  URLstutus= ExpectedUrl.equals(ActualUrl);
		  
		  if (URLstutus== true) {
			  System.out.println("URl validation passed");
		  }
		  else {
			  System.out.println("URL validation failed");
		  }
		
		  
		//2. Page title validation
		  
		String Eptitle, Aptitle;
		
		Eptitle = "Welcome: Mercury Tours";
		
		boolean Titlesatus;
		
		Aptitle = driver.getTitle();
	
		
		System.out.println(driver.getTitle());
		
		Titlesatus = Eptitle.equals(Aptitle);
		
		if (Titlesatus == true) {
		System.out.println("Page Title validation Passed");
			
		}
		else { 
			System.out.println("  Page title validation failed");
		}
		
		
	// Registration page.
		
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();

	// Enter into all the registration filed
	
	driver.findElement(By.name("firstName")).sendKeys("Eamy");
    driver.findElement(By.name("lastName")).sendKeys("Islam");
    driver.findElement(By.name("phone")).sendKeys("612-231-2990");
    driver.findElement(By.name("userName")).sendKeys("eamy23459@gmail.com");
	driver.findElement(By.name("address1")).sendKeys("1104 chestnul ln");		  
	driver.findElement(By.name("city")).sendKeys("south lyon");
	driver.findElement(By.name("state")).sendKeys("MI");
	driver.findElement(By.name("postalCode")).sendKeys("48375");
	driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option[19]")).click();
	
	//Declare the drop-down element as an instance of the Select class.
	//In the example below, we named this instance as "drpCountry

			
			  Select country = new Select(driver.findElement(By.name("country")));
			  
			  country.selectByVisibleText("UNITED STATES");
			 
 
	driver.findElement(By.name("email")).sendKeys("qatester");
	driver.findElement(By.name("password")).sendKeys("abc123");
	driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
	// Submit
	
	driver.findElement(By.name("submit")).click();
	   
	
	
	}catch (Exception e){	 
		throw e;
}
	
	
	
	}
	
	
	
	
	
	}
	
	


