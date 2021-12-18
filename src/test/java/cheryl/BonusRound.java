package cheryl;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BonusRound {
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

	// get title
	String actualTitle = driver.getTitle();

	if (actualTitle.equals("Register")) {
		System.out.println("verified");
	}

	WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstName.sendKeys("Cheryl");

	WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lastName.sendKeys("Thai");

	driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("111 Rolling Rd");
	driver.findElement(By.xpath(
			"//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"))
			.sendKeys("hhh@gmail.com");
	driver.findElement(By.xpath(
			"//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']"))
			.sendKeys("111222333");

	driver.findElement(By.xpath("//input[@value='FeMale']")).click();

	WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
	WebElement checkbox2 = driver.findElement(By.id("checkbox2"));
	WebElement checkbox3 = driver.findElement(By.id("checkbox3"));
	checkbox2.click();
	checkbox3.click();

	// making sure dropdown has select tagname and store it in webelement
	WebElement skills = driver.findElement(By.id("Skills"));

	// create Select object
	Select skillS = new Select(skills);

	// store all dropdown options in list<Webelement>
	List<WebElement> SDrop = skillS.getOptions();

	for (WebElement s : SDrop) {

		String SText = s.getText();
		if (SText.equals("Java")) {
			s.click();
			break; // get out the loop
		}

	}

	// store countries dropdown in Webelement
	WebElement countries = driver.findElement(By.id("country"));

	// create another Select object for countries dropdown
	Select countriesS = new Select(countries);

	// stores all dropdown options in list<webelement>
	List<WebElement> CDrop = countriesS.getOptions();

	for (WebElement c : CDrop) {

		String myCountry = c.getText();
		if (myCountry.equals("United States of America")) {
			c.click();
			break; // get out the loop
		}
	}

	// choose Year for DOB
	WebElement year = driver.findElement(By.id("yearbox"));

	Select yearS = new Select(year);
	List<WebElement> YDrop = yearS.getOptions();

	for (WebElement y : YDrop) {
		String myYear = y.getText();

		if (myYear.equals("1989")) {
			y.click();
			break;
		}
	}

	// choose month

	WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));

	Select monthS = new Select(month);
	List<WebElement> MDrop = monthS.getOptions();

	for (WebElement m : MDrop) {
		String myMonth = m.getText();

		if (myMonth.equals("June")) {
			m.click();
			break;
		}
	}

	// choose date
	WebElement date = driver.findElement(By.id("daybox"));

	Select dateS = new Select(date);
	List<WebElement> DDrop = dateS.getOptions();

	for (WebElement d : DDrop) {
		String myDate = d.getText();

		if (myDate.equals("6")) {
			d.click();
			break;
		}
	}

	// enter password
	driver.findElement(By.id("firstpassword")).sendKeys("225566");

	// confirm password
	driver.findElement(By.id("secondpassword")).sendKeys("225566");
	WebElement iframe = driver.findElement(By.xpath("//iframe[@id='aswift_3']"));
	driver.switchTo().frame(iframe);

//	driver.findElement(By.id("submitbtn")).click();

	Thread.sleep(5000);
	driver.quit();
}
}
