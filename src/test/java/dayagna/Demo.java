package dayagna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

public static void main(String[] args) throws InterruptedException {
		
		String url = "http://demoqa.com/text-box/";
			
		
		System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vdaya\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
			 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.findElement(By.id("userName")).sendKeys("vdaya");;
		driver.findElement(By.id("userEmail")).sendKeys("vdayagna@gmail.com");;
		driver.findElement(By.id("currentAddress")).sendKeys("1081 nw 195 st,miami, fl 33165");;
		driver.findElement(By.id("permanentAddress")).sendKeys("1081 nw 195 st,miami, fl 33165");;
		
		 driver.findElement(By.id("submit")).click();
		 
       Thread.sleep(5000);
		
		driver.quit();
	
		
		
		//Scenario: Fill out the form and submit
		//1. Launch chrome browser
		//2. Navigate to http://demoqa.com/text-box
		//3. Enter name in the full name field 
		//4. Enter email in the email field
		//5. Enter address in the 1st Current Address field
		//6. Enter different address in the 2nd Current Address field
		//7. Click submit 
	//	8. Close the browse

	}

}


	


 
}
