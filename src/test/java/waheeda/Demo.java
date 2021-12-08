package waheeda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main (String []args)throws InterruptedException {
		
		String url = "http://demoqa.com/text-box";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Wahida\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);
		
		driver.findElement(By.id("userName")).sendKeys("Waheeda");
		driver.findElement(By.id("userEmail")).sendKeys("wah.alam3@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Noorteck 123");
		driver.findElement(By.id("permanentAddress")).sendKeys("Noorteck 2");
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
	
 
}
