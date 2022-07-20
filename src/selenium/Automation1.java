package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sundarapandian\\eclipse-workspace\\Selenium_Tutorial\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		WebElement emailid = driver.findElement(By.id("email_create"));
		emailid.sendKeys("sundarapandian.ramanujam@gmail.com");
		
		WebElement accountcreation = driver.findElement(By.id("SubmitCreate"));
		accountcreation.click();
		
		Thread.sleep(4000);
		
		WebElement radiobutton = driver.findElement(By.id("id_gender1"));
		radiobutton.click();
		
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("gnanaguru");
		
		WebElement lastname = driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys("ayyanar");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("vinayaga@44");
		
		WebElement dobday = driver.findElement(By.id("days"));
		
		Select p1 = new Select(dobday);
		p1.selectByValue("28");
		
		WebElement dobmonth = driver.findElement(By.id("months"));
		
		Select p2 = new Select(dobmonth);
		p2.selectByIndex(4);
		
		WebElement dobyear = driver.findElement(By.id("years"));
		
		Select p3 = new Select(dobyear);
		p3.selectByIndex(8);
		
		WebElement radiobutton1 = driver.findElement(By.id("newsletter"));
		radiobutton1.click();
		
		WebElement radiobutton2 = driver.findElement(By.id("optin"));
		radiobutton2.click();
		
		WebElement firstname1 = driver.findElement(By.id("firstname"));
		firstname1.sendKeys("gnanaguru");
		
		WebElement lastname1 = driver.findElement(By.id("lastname"));
		lastname1.sendKeys("ayyanar");
		
		WebElement companyname = driver.findElement(By.id("company"));
		companyname.sendKeys("Infosys");
		
		WebElement addressline = driver.findElement(By.id("address1"));
		addressline.sendKeys("no:8,Thiruvalluvar street,chennai");
		
		WebElement addressline2 = driver.findElement(By.id("address2"));
		addressline2.sendKeys("firstfloor,vinayaga builders");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("seattle");
		
		WebElement state = driver.findElement(By.id("id_state"));
		
		Select v1 = new Select(state);
		v1.selectByValue("47");
		
		WebElement post = driver.findElement(By.id("postcode"));
		post.sendKeys("98101");
		
		WebElement country = driver.findElement(By.id("id_country"));
		
		Select v2 = new Select(country);
		v2.selectByValue("21");
		
		WebElement addinformation = driver.findElement(By.id("other"));
		addinformation.sendKeys("Access front line");
		
		WebElement homephone = driver.findElement(By.id("phone"));
		homephone.sendKeys("45024802");
		
		WebElement mobile = driver.findElement(By.id("phone_mobile"));
		mobile.sendKeys("8884441526");
		
		WebElement alias = driver.findElement(By.id("alias"));
		alias.sendKeys("WALES OF USA");
		
		WebElement register = driver.findElement(By.id("submitAccount"));
		register.click();
		
		

	}

}
