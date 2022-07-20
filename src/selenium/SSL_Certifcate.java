package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL_Certifcate {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sundarapandian\\eclipse-workspace\\Selenium_Tutorial\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		ChromeOptions ssl = new ChromeOptions();
		ssl.setAcceptInsecureCerts(false);
		
		driver.get("https:expired.badssl.com/");
		
		System.out.println("page title is :" + driver.getTitle());
		
		

	}

}
