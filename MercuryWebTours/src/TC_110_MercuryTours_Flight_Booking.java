import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*****************************************************************************
//Test Name: TC_110_MercuryWebTours_Flight_Booking
// Test Description: User should able to book flight in MecuryWebTour.
// Test Engineer: EAMY
//Date : 8/24/2020
//Review History:
//***********************************************************************************/

public class TC_110_MercuryTours_Flight_Booking {

	public static void main(String[] args) {
		try {
	// set system property for chrome broswer
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe");
		
		// Instantiate of the object
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the homepage
		driver.get("http://demo.guru99.com/test/newtours/");
		
		//implecite wait 
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		//maximize the window
		driver.manage().window().maximize();
	  
		
	//click on sigh on button
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]")).click();
	//Enter the username and password
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
	   
		
		
		//Validation of login successfull
		
		String actual; 
		String expecTed;
		expecTed="Login Successfully";
		actual=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
		
		
     if (actual.equals(expecTed)) {
    	 System.out.println("passed");
    	 
     } else {
    	 System.out.println("not passed");
    	 }

     
			
			  //click on flight link 
              driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3"
			  )).getText();
			  //click on oneway button 
			  driver.findElement(By.xpath( "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"
			  )).click();
			  //click on Passengers: 
			  driver.findElement(By.xpath( "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]"
			  )).click(); 
			  //click on Departing From:
			  driver.findElement(By.xpath( "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select/option[2]"
			  )).click(); 
			  // click on "on" button 
			  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select/option[4]"
			  )).click(); 
			  //click on Arriving date 
			  driver.findElement(By.xpath( "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]/option[2]"
			  )).click();
			  // click on Returning 
			  driver.findElement(By.xpath( "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[2]/option[9]"
			  )).click(); 
			  //click on Returning date 
			  driver.findElement(By.xpath( "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td[2]/select/option[3]"
			  )).click(); 
			  //click on Service Class
			  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]"
			  )).click(); 
			  //click on airlines 
			  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select/option[3]"
			  )).click(); 
			  //click on continue 
			  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input"
			  )).click(); 
			  // validation page 
			  driver.findElement(By.xpath( "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/p/font/b/font[1]"
			  )).getText();
			  
			 

   // Select country = new Select(driver.findElement(By.name("Departing From")));
    
	//country.selectByVisibleText("New York");






WebElement expectedSeatERROR = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/p/font/b/font[1]"));

			  //Validation of After flight finder - No Seats Avaialble
			  
			  String actualSeat, expectedSeat,updatedseat;
			  expectedSeat="After flight finder - No Seats Avaialble  ";
			  actualSeat=expectedSeatERROR.getText(); updatedseat= expectedSeat.trim();
			  
			  System.out.println(actualSeat);
			  
			  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			  
			  if (updatedseat.equals(expectedSeat)) {
			  
			  System.out.println("validation passed"); }
			  
			  else { System.out.println("validation not passed"); }
		
    //driver.quit();

		}catch(Exception e) {
			throw(e);
		}

	}
}
//*************************************************************************************************
//EOS
//*************************************************************************************************