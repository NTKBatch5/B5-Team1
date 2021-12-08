package yahya;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		// set System property for chromedrive
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\yahya\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.id("userName")).sendKeys("Yahya Khshali");
		driver.findElement(By.id("userEmail")).sendKeys("yahya985@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("irvine, CA");
		driver.findElement(By.id("permanentAddress")).sendKeys("Orange County");
		
		driver.findElement(By.partialLinkText("Submit")).click();
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
