package cheryl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
public static void main(String[] args) throws InterruptedException {
	
	String url = "http://demo.automationtesting.in/Frames.html";

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Cheryl\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.manage().window().maximize();

	driver.get(url);

	String parentWindow = driver.getWindowHandle();

	// click on Single iframe button
	driver.findElement(By.xpath("//a[contains(text(),'Single Iframe ')]")).click();

	// store the single iframe in webelement
	WebElement singleIframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	
	driver.switchTo().frame(singleIframe);//give control to singleIframe

	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Accessing Iframe");//enter text in the txt field
	Thread.sleep(2000);//wait for 2 seconds
	
	//give control back to parent page
	driver.switchTo().defaultContent();
	
	//look for Iframe with in an iframe button
	driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
	
	//store outeriframe in webelement
	WebElement outerIframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	
	//switch control to outer iframe;
    driver.switchTo().frame(outerIframe);
	
    //store inner iframe to webelement
	WebElement innerIframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	driver.switchTo().frame(innerIframe);//switch control to inner iframe
	
	//enter the text in the text field
	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Iframe is easy");
	driver.switchTo().parentFrame();//switch control back to parent iframe
	driver.switchTo().defaultContent();//switch control back to main web page
	
	driver.findElement(By.linkText("Home")).click();//click home button
	 
	String actualTitle = driver.getTitle();//get the title of an openned window
	if(actualTitle.equals("index")) { //if the title is index, then print
		System.out.println("the title is verified");
	}else {
		System.out.println("not verified");
	}
	
	Thread.sleep(5000);
	driver.quit();
}
}
