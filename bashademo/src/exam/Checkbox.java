package exam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//selecting check box 
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Thread.sleep(3000);
		
		// un selecting the check box
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		
		// count of check boxes present in the web page
		int checkbox=driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(checkbox);
		
		
	}

}
