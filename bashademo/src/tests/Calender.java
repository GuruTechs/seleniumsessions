package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String clickable=Keys.chord(Keys.ENTER);
		driver.findElement(By.cssSelector(".elementor-field.elementor-size-sm.elementor-field-textual.elementor-date-field.flatpickr-input")).sendKeys(clickable);
		
		while(!driver.findElement(By.cssSelector("[class='cur-month']")).getText().contains("December"))
		{
			   driver.findElement(By.cssSelector("[class='flatpickr-month'] [class*='flatpickr-next-month'] svg")).click();
		}
			   
		
		List<WebElement>  dates=driver.findElements(By.cssSelector(".flatpickr-day"));
	   
	   int datecount=driver.findElements(By.cssSelector(".flatpickr-day")).size();
	   
	   for(int i=0;i<datecount; i++)
	   {
		  String text=driver.findElements(By.cssSelector(".flatpickr-day")).get(i).getText();
		   
		   if(text.equalsIgnoreCase("23"))
		   {
			   driver.findElements(By.cssSelector(".flatpickr-day")).get(i).click();
			   break;
		   }
	   }
	   
		

	}

}
