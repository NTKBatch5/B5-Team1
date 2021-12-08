package dayagna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		String url ="http://demo.guru99.com/test/newtours/";
	     
	       System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vdaya\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
	       
	   	WebDriver driver = new ChromeDriver();
		
	   	//maximize the window
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get(url);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		//4. Verify the page title is “Register: Mercury Tours”
		
		
		driver.findElement(By.name("firstName")).sendKeys("Dayagna");
		driver.findElement(By.name("lastName")).sendKeys("Venzant");
		driver.findElement(By.name("phone")).sendKeys("7867810793");
		driver.findElement(By.id("userName")).sendKeys("vdaya");
		driver.findElement(By.name("address1")).sendKeys("1095 nw 195 st");
		driver.findElement(By.name("city")).sendKeys("Miami");
		driver.findElement(By.name("state")).sendKeys("fl");
		driver.findElement(By.name("postalCode")).sendKeys("33165");
		driver.findElement(By.id("email")).sendKeys("vdayagna@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		//17. Get the confirmation text message and check if the confirmation text message 
		//contains “Thank you for registering.” phrases. 
		//a. If it does then print “The testcase passed” otherwise “The testcase failed”
		
		
		Thread.sleep(5000);
		driver.quit();
			
			
				
			
			/**Scenario: Register new user in Mercury Tours page
			1. Launch chrome browser 
			2. Navigate to http://demo.guru99.com/test/newtours/
			3. Click Register 
			4. Verify the page title is “Register: Mercury Tours”
			5. Enter first name 
			6. Enter last name
			7. Enter phone number
			8. Enter email 
			9. Enter address
			10. Enter city
			11. Enter state
			12. Enter zip code
			13. Enter username
			14. Enter password
			15. Enter password in confirm password field
			16. Click submit button
			17. Get the confirmation text message and check if the confirmation text message 
			contains “Thank you for registering.” phrases. 
			a. If it does then print “The testcase passed” otherwise “The testcase 
			failed”
			18. Close the browse
			*/

	}

}
