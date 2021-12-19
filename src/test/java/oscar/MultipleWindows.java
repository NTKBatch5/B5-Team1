package oscar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	WebDriver driver;
	
	String url = "http://demo.automationtesting.in/Windows.html";
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		MultipleWindows obj1 = new MultipleWindows();
		
		obj1.setup();
		
		obj1.multipleWindows();
		
		
	}
	
	public void multipleWindows() throws InterruptedException {
		
		driver.get(url);
		
		if(driver.getTitle().equals("Frames & windows")){
			System.out.println("We are in correct page");
		}else {
			System.out.println("we are in wrong page, but I will continue with my automation.");
			
		}
		
		String parentWindow = driver.getWindowHandle();
				
		driver.findElement(By.xpath("//div[1]/div/div/div/div[1]/ul/li[3]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button")).click();
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("//div[1]/div/div/div/div[1]/ul/li[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		driver.switchTo().window(parentWindow);
		
		for(String windowHandle: driver.getWindowHandles()) {
			if(driver.switchTo().window(windowHandle).getTitle().equals("Index")){
				
				break;
			}
		}
		
		if(driver.getTitle().equals("Index")) {
			System.out.println("We are in index page");
		}else {
			System.out.println("We are not in index page");
		}
		
		if((driver.findElement(By.id("btn1")).isDisplayed()) && ((driver.findElement(By.id("btn2")).isDisplayed()))) {
			System.out.println("All elements displayed");
			}else {
			System.out.println("Not all elements displayed");
		}
		
		Thread.sleep(3000);
		
		driver.close();
		
		for(String windowHandle: driver.getWindowHandles()) {
			if(driver.switchTo().window(windowHandle).getTitle().equals("SeleniumHQ Browser Automation")){
				
				break;
			}
		}
		
		if(driver.getTitle().equals("Selenium")) {
			System.out.println("We are in Selenium website");
		}else {
			System.out.println("We are not in Selenium website");
		}
		
		driver.findElement(By.linkText("Documentation")).click();
		
		if(driver.findElement(By.xpath("//div/div[1]/div/main/div/h1")).getText().equals("The Selenium Browser Automation Project")){
			System.out.println("Woooow, once I am done here I will read all the available documents");
			}else {
				System.out.println("I am stil going to read all the available documents");
			}
			
		driver.switchTo().window(parentWindow);
		
		if(driver.getTitle().equals("Frames & windows")){
			System.out.println("I am done, now need to read Selenium documentation");
		}else {
			System.out.println("Selenium Documentation...");
		}
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
	
	public void setup()	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\oscar\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
				
		driver = new ChromeDriver();

		driver.manage().window().maximize();
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
