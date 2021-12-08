package cheryl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CherylHW2 {
public static void main(String[] args) throws InterruptedException {
	
	
	String url = "http://demo.guru99.com/test/newtours/";
	
	//apply system setProperty()
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cheryl\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
	
	//create WebDriver object
	WebDriver driver = new ChromeDriver();
	
	//get the url
	driver.get(url);
	
	//maximize the windows
	driver.manage().window().maximize();
	
	//click register button
	driver.findElement(By.linkText("REGISTER")).click();
	
   //get titile
	
	
	//enter first name
	driver.findElement(By.name("firstName")).sendKeys("Cheryl");
	
	//enter last name
	driver.findElement(By.name("lastName")).sendKeys("Thai");
	
	//enter phone
	driver.findElement(By.name("phone")).sendKeys("123-456-789");
	
	//enter email
	driver.findElement(By.id("userName")).sendKeys("tqc@gmail.com");
	
	//enter adrress
	driver.findElement(By.name("address1")).sendKeys("123 Running rd");
	
	//enter city
	driver.findElement(By.name("city")).sendKeys("Woodbrige");
	
	//enter state
	driver.findElement(By.name("state")).sendKeys("VA");
	
	driver.findElement(By.name("postalCode")).sendKeys("12345");
	
	driver.findElement(By.name("country")).sendKeys("USA");
	
	driver.findElement(By.id("email")).sendKeys("tqc@gmail.com");
	
	driver.findElement(By.name("password")).sendKeys("123456@@");
	
	driver.findElement(By.name("confirmPassword")).sendKeys("123456@@");
	
	//click submit button
	driver.findElement(By.name("submit")).click();
	
	//17. Get the confirmation text message and check if the confirmation text message contains
	//“Thank you for registering.” phrases. a. If it does then print “The testcase passed” otherwise “The testcase
	//failed”
	
	Thread.sleep(7000);
	
	driver.quit();
			
	
	
}
}
