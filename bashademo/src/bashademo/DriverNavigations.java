package bashademo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigations {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.navigate().to("https://rahulshettyacademy.com");
		driver.manage().window().maximize();
		
		driver.navigate().back();
		driver.navigate().forward();
		

	}

}
