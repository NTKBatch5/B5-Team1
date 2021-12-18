package cheryl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHW {
public static void main(String[] args) throws InterruptedException {


	String url = "http://demo.automationtesting.in/Index.html";

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Cheryl\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.manage().window().maximize();

	driver.get(url);

	driver.findElement(By.xpath("//button[contains(text(),'Skip Sign In')]")).click();// click on skip sign in
																						// button

	WebElement switchTo = driver.findElement(By.linkText("SwitchTo"));// nevigate to switch to button and store in
																		// webelement
	switchTo.click();

	driver.findElement(By.linkText("Alerts")).click();//select alert

	//store 1st iframe in webelement and switch control to it
	WebElement outerIframe = driver.findElement(By.xpath("//iframe[@id='aswift_2']"));
	driver.switchTo().frame(outerIframe);

	//store 2nd iframe in webelement and switch control to it
	WebElement innerIframe = driver.findElement(By.xpath("//*[@id='ad_iframe']"));
	driver.switchTo().frame(innerIframe);

	//click close button in 2nd iframe
	driver.findElement(By.xpath("//*[@id='dismiss-button']")).click();
	driver.switchTo().defaultContent();//then give control back to main web page

	String actualTitle = driver.getTitle();//get the title
	Thread.sleep(1000);
	if (actualTitle.equals("Alerts")) {//if the title is Alert, then print

		System.out.println("It is verified");
	} else {

		System.out.println(actualTitle);
	}

	// click on alert with textbox button
	driver.findElement(By.xpath("//a[@href='#Textbox']")).click();

	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

	// create Alert interface object
	Alert alert = driver.switchTo().alert();

	// enter text
	alert.sendKeys("Cheryl");

	// click ok button
	alert.accept();

	// refresh the page
	driver.navigate().refresh();
	driver.switchTo().defaultContent();//give control back to the main web page

	// click alert with ok button
	driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();

	// click on display button
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

	driver.switchTo().alert();//switch control to alert 

	String alertText = alert.getText();//get the text from alert

    if (alertText.contains("Press a Button !")) {//if alert text contains mesage
		alert.dismiss();//true=> cancel
	} else {
		alert.accept();//false=> ok.
	}

	driver.switchTo().defaultContent();//give control back to main web page

	driver.close(); //close the browser

	Thread.sleep(5000);
	driver.quit();
}
}

