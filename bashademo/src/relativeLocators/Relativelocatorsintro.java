package relativeLocators;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativelocatorsintro {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox=driver.findElement(By.cssSelector("[name='name']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		WebElement dob=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		
		WebElement checkmsg=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checkmsg)).click();
		

	}

}
