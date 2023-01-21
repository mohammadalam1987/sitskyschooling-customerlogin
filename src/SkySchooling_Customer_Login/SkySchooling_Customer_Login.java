package SkySchooling_Customer_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkySchooling_Customer_Login {

	public static void main(String[] args) throws InterruptedException {
		
		//Set Property
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Driver\\chromedriver.exe");
		
		//Declaring WevDriver object variable named driver
		WebDriver driver;
		
		//Instantiate Driver object by ChromeDriver constructor
		driver = new ChromeDriver();
		
		//Go to sit.SkySchooling Website
		driver.get("https://sit.skyschooling.com/microtech/");

		
		//8 Locators: id, name, className, tagName, linkedText, partialLinkedText, xPath, cssSelectors
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("LOG IN")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Customer Login")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("mailuid")).sendKeys("david@gamil.com");
		
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("1234");
		
		Thread.sleep(2000);
		driver.findElement(By.name("login-submit")).click();

		

		

	}//Main

}//Class
