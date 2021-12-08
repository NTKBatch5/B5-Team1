package yari;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://demoqa.com/text-box";
		
		// set the system property
		System.setProperty("webdriver.chrome.driver",
				 "/Users/yary/Desktop/Selenium/chromedriver");
	
		// create webdriver object
		WebDriver driver = new ChromeDriver();
		
		
		Thread.sleep(10000);
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to the url
		driver.get(url);

		
		//Enter name in the full name field
		driver.findElement(By.id("userName")).sendKeys("yari Buckley");
	
		
	    // Enter email in the email field
		driver.findElement(By.id("userEmail")).sendKeys("yarys87@yahoo.es");
	
		
	   // Enter address in the 1st Current Address field
	     driver.findElement(By.id("currentAddress")).sendKeys("1996 Bonnie Ct Dunedin Fl");
	     
	
			
	     // Enter different address in the 2nd Current Address field
	     driver.findElement(By.id("permanentAddress")).sendKeys("18 Mulberry St Clinton NY");
	   
			
			Thread.sleep(10000);
	 
     	
	 	Thread.sleep(3000);
	 	//Click submit
	     //not working
	    driver.findElement(By.id("submit")).click();
	   
	     //wait 3s
	     
	    
		 //Close the browser
	    driver.quit();
	    
	} 
}
