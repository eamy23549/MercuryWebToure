import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_104_MercuryWeb_Registration_Validation {

	public static void main(String[] args) {
		

/*****************************************************************************
//Test Name: TC_104_MercuryWeb_Registration_Validation
// Test Description: Validation of Registration page.
// Test Engineer: EAMY
//Date : 8/17/2020
//Review History:
//***********************************************************************************/
		// Set driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumInstallation\\Miscellaneous\\chromedriver.exe");

		// Instantiate of an object
		WebDriver driver = new ChromeDriver();

		// Navigating to the specified URL
		driver.get("http://demo.guru99.com/test/newtours/");

		// Following line of code will maximize the browser
		driver.manage().window().maximize();


		// Click on the Register link using Xpath
		// Following line of code will click on register link
		//driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();

		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		
		
		// Enter first name into the first name field
		driver.findElement(By.name("firstName")).sendKeys("Adam");

		
		
		// Enter last name into the last name field
		driver.findElement(By.name("lastName")).sendKeys("Sandler");

		// Enter phone number into the phone number field
		driver.findElement(By.name("phone")).sendKeys("(123) 456 1234");

		// Enter email address into the Email field
		driver.findElement(By.name("userName")).sendKeys("mytest@gmail.com");

		// Enter address into the address field
		driver.findElement(By.name("address1")).sendKeys("123 DotConnect Way");

		// Enter city name into the city field
		driver.findElement(By.name("city")).sendKeys("Baltimore");

		// Enter your state name into the state field
		driver.findElement(By.name("state")).sendKeys("MD");

		// Enter postal code
		driver.findElement(By.name("postalCode")).sendKeys("21228");



		//Declare the drop-down element as an instance of the Select class.
		//In the example below, we named this instance as "drpCountry"
		Select drpCountry = new Select(driver.findElement(By.name("country")));

		drpCountry.selectByVisibleText("UNITED STATES");


		// Enter username into the username field
		driver.findElement(By.name("email")).sendKeys("qatester");

		// Enter password into the password field
		driver.findElement(By.name("password")).sendKeys("abc123");
		
		// Enter same password into the confirm password field
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123");

		// Click on submit button
		driver.findElement(By.name("submit")).click();


		// Validation point or verification point or check point




		// Close the current browser and any other child browsers opened by the application
		//driver.quit();
		
		// Validate the URL whether it is landed correct home page or not

		String ExpectedURL, ActualURL;

		boolean URLStatus;

		ExpectedURL = "http://demo.guru99.com/test/newtours/";

		ActualURL = driver.getCurrentUrl();

		URLStatus = ExpectedURL.equals(ActualURL);

		if (URLStatus == true) {
		System.out.println("URL Validation is passed");
		}

		else {
		System.out.println("URL Validation is failed!");
		}
		//*******************************************************************************
		// Validate Title of the page
		//*******************************************************************************

		String ExpectedTitle, ActualTitle;
		boolean TitleStatus;

		ExpectedTitle = "Welcome: Mercury Tours";
		ActualTitle = driver.getTitle();

		TitleStatus = ExpectedTitle.equals(ActualTitle);

		if (TitleStatus == true) {
		System.out.println("Title of the home page validation is passed!");
		}

		else {
		System.out.println("Title of the home page validation is failed!");
		}	
	/*
	 * ****************************************************************************************************************
      End
	 *******************************************************************************************************************
	*/		

	}

}
