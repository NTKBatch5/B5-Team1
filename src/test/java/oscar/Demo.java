package oscar;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demoqa.com/text-box";
		
		//Set System Property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\oscar\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		
		//Create WebDriver object
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//navigate to url
		driver.get(url);
		
		//enter name
		driver.findElement(By.id("userName")).sendKeys("Oscar Sanchez");
		Thread.sleep(1000);
		//enter email
		driver.findElement(By.id("userEmail")).sendKeys("oscsnz@gmail.com");
		//enter address
		driver.findElement(By.id("currentAddress")).sendKeys("Residencial Casa Maya 2");
		//enter permanent address
		driver.findElement(By.id("permanentAddress")).sendKeys("Honduras");
		
		Thread.sleep(1000);
		//click submit
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(3000);
		//close the browser
		driver.quit();
	}	
}