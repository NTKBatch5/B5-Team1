package cheryl;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindows {
public static void main(String[] args) throws InterruptedException {
	
	String url = "http://demo.automationtesting.in/Windows.html";

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Cheryl\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.manage().window().maximize();

	driver.get(url);

	String actualTitle = driver.getTitle();// driver here is object of Webdriver interface

	if (actualTitle.equals("Frames & windows")) {
		System.out.println("we are in correct page");

	} else {
		System.out.println(" we are in wrong page, but I will continue with my automation");
	}

	String parentWindow = driver.getWindowHandle();
	System.out.println(parentWindow);

	// click on Open Separate Multiple Windows
	driver.findElement(By.xpath("//a[contains(text(),'Open Seperate Multiple Windows')]")).click();
	Thread.sleep(1000);

	// click on clik button
	driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
	Thread.sleep(3000);

	// put all opnned windows after clicking into the set interface with the return
	// String
	Set<String> windows = driver.getWindowHandles();

	for (String window : windows) {

		// switch the current window to another window
		driver.switchTo().window(window);

		// get the title
		String title = driver.getTitle();

		
		// apply if condition to match the main web page title
		if (title.equals(actualTitle)) {
			
			driver.switchTo().window(window);
			
			// then, look for open new tabbed windows and click
			driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows ')]")).click();
			Thread.sleep(1000);

			// and click button
			driver.findElement(By.xpath("//button[contains(text(),'    click   ')]")).click();
			Thread.sleep(1000);

		}

		// if the title of the openned window is Index then print We are in index page
		if (title.equals("Index")) {
			driver.switchTo().window(window);
			
			System.out.println("We are in index page");

			// check index page has sign in and skip sign in button display in the page
			// store return sign in button in webelement
			WebElement signIn = driver.findElement(By.xpath("//button[@id='btn1']"));

			// store return skip sign in button in webelement
			WebElement skipSignIn = driver.findElement(By.xpath("//button[@id='btn2']"));

			// store the value of isDisplayed() in display1
			boolean display1 = signIn.isDisplayed();

			// store the value of isDisplayed() in display2
			boolean display2 = skipSignIn.isDisplayed();

			// if both condition are true, then print
			if (display1 == true && display2 == true) {

				System.out.println("all elements displayed");
				
			} else {
				System.out.println("not all elements displayed");
			}
			driver.close();

		} else {

			System.out.println("We are not in index page");
		}
		
		
        //switch control to selenium page
		if(title.equals("Selenium")) {
			
			driver.switchTo().window(window);
			
			//click on documentation
			driver.findElement(By.linkText("Documentation")).click();
		    
			//store the text in display3
			WebElement display3 = driver.findElement(By.xpath("//h1[text()='The Selenium Browser Automation Project']"));
			
			//if the txt is displayed , then print
			if(display3.isDisplayed()) {
				
				System.out.println("Woooow, once I am done here I will read all the available documents");
			}else {
				System.out.println("I am still going to read all the availabe documents");
				
			}
			driver.close();//close the selenium page
		}
		
		//give control back to main web page
		driver.switchTo().window(parentWindow);
		
		//if the title is matched, then print
		if (actualTitle.equals("Frames & windows")) {
			
			System.out.println("I am done, now need to read Selenium documentation");
		
		} else {
			
			System.out.println("Selenium Documentation...");
		}
		
		
	}

	Thread.sleep(3000);
	driver.quit();
}
}

