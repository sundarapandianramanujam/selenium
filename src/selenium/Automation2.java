package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sundarapandian\\eclipse-workspace\\Selenium_Tutorial\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		driver.findElement(By.id("email")).sendKeys("sundarapandian.ramanujam@gmail.com");
		
		driver.findElement(By.id("passwd")).sendKeys("vinayaga@44");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		
		driver.findElement(By.id("list")).click();
		
		driver.findElement(By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[2]")).click();
		
		WebElement quantity = driver.findElement(By.id("quantity_wanted"));
		quantity.clear();
		quantity.sendKeys("4");
		
		WebElement size = driver.findElement(By.id("group_1"));
		
		Select k = new Select(size);
		k.selectByIndex(1);
		
		driver.findElement(By.id("color_13")).click();
		
		driver.findElement(By.id("add_to_cart")).click();
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		driver.findElement(By.id("cgv")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		driver.findElement(By.xpath("//a[@title='Back to orders']")).click();
		
		driver.findElement(By.xpath("//a[@title='Log me out']")).click();
		
		
		
		
		
		

	}

}
