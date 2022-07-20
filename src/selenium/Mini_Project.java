package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sundarapandian\\eclipse-workspace\\Selenium_Tutorial\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("gnanaguru");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("velayudham12");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		
		Select g = new Select(location);
		g.selectByIndex(4);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		
		Select g1 = new Select(hotel);
		g1.selectByIndex(1);
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		
		Select g2 = new Select(roomtype);
		g2.selectByVisibleText("Deluxe");
		
		WebElement rooms = driver.findElement(By.id("room_nos"));
		
		Select g3 = new Select(rooms);
		g3.selectByValue("5");
		
		WebElement checkin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		checkin.sendKeys("15/06/2022");
		
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("18/06/2022");
		
		WebElement adultperroom = driver.findElement(By.id("adult_room"));
		
		Select g4 = new Select(adultperroom);
		g4.selectByValue("2");
		
		WebElement childrenperoom = driver.findElement(By.id("child_room"));
		
		Select g5 = new Select(childrenperoom);
		g5.selectByIndex(1);
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@type='radio']"));
		radiobutton.click();
		
		WebElement continuebutton = driver.findElement(By.id("continue"));
		continuebutton.click();
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("gnanaguru");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("ayyanar");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("no:8,vinayagar street,vadapalani,chennai-26,Tamilnadu,India");
		
		WebElement creditcardno = driver.findElement(By.id("cc_num"));
		creditcardno.sendKeys("4444 4545 2885 5959");
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		
		Select g6 = new Select(cardtype);
		g6.selectByIndex(2);
		
		WebElement expirymonth = driver.findElement(By.id("cc_exp_month"));
		
		Select g7 = new Select(expirymonth);
		g7.selectByIndex(4);
		
		WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));
		
		Select g8 = new Select(expiryyear);
		g8.selectByVisibleText("2023");
		
		WebElement cvvno = driver.findElement(By.id("cc_cvv"));
		cvvno.sendKeys("988");
		
		WebElement booking = driver.findElement(By.id("book_now"));
		booking.click();
		
		Thread.sleep(4000);
		
		
		
	//	WebElement logout = driver.findElement(By.id("logout"));
	//	logout.click();
		
		
		
		
		
		
		

	}

}
