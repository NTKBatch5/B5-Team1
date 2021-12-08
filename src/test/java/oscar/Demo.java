package oscar;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		
		url = "https://demo.guru99.com/test/newtours/";
		
		driver.get(url);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		String expectedTitle = "Register: Mercury Tours";
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equalsIgnoreCase(expectedTitle)){
			
		driver.findElement(By.name("firstName")).sendKeys("Oscar");
		
		driver.findElement(By.name("lastName")).sendKeys("Sanchez");
		
		driver.findElement(By.name("phone")).sendKeys("+504 97903667");
		
		driver.findElement(By.name("address1")).sendKeys("Residencial Casa Maya 2");
		
		driver.findElement(By.name("city")).sendKeys("San Pedro Sula");
		
		driver.findElement(By.name("postalCode")).sendKeys("21102");
		
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		
		drpCountry.selectByVisibleText("HONDURAS");
		
		driver.findElement(By.id("email")).sendKeys("oscsnz");
		
		driver.findElement(By.name("password")).sendKeys("mateo2017");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("mateo2017");
		
		driver.findElement(By.name("submit")).click();
		}
		
		Thread.sleep(4000);
		
		driver.quit();
	}	
}