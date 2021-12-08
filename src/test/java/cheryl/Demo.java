package cheryl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demoqa.com/text-box";
		
		//system setProperty
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cheryl\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		
		//create WebDriver object
		WebDriver driver = new ChromeDriver();
		
		//get the url using get() method
		driver.get(url);
		
		//maximize the windows
		driver.manage().window().maximize();
		
		//enter the name
		driver.findElement(By.id("userName")).sendKeys("Chau Thai");
		
		//enter email
		driver.findElement(By.id("userEmail")).sendKeys("thai_quechau@yahoo.com");
		
		//enter 1st address
		driver.findElement(By.id("currentAddress")).sendKeys("71 Juldan pl, Woodride, VA 22222");
		
		//enter 2nd address
		driver.findElement(By.id("permanentAddress")).sendKeys("14311 Falmouth st, Annadale, VA 11111");
		
		//click on submit button
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(7000);
		
		driver.quit();
				
		
	}
 
}
