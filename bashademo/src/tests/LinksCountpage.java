package tests;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCountpage {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1. counnting the links in entire page
		
		
		System.out.println("Driver  = "  +driver.findElements(By.tagName("a")).size());
		
		// limiting the webdriver to particular space..
		
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		
		//1. counnting the links in entire page
		
		System.out.println( "Footerdriver  = "  + footerDriver.findElements(By.tagName("a")).size());
		
		//counting the links in footer row section
		
		WebElement row=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(row.findElements(By.tagName("a")).size());
		
		
		 List<WebElement> clickrowlinks = row.findElements(By.tagName("a"));
		
		for(int i=1;i<clickrowlinks.size();i++)
		{
			String opennewtab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			clickrowlinks.get(i).sendKeys(opennewtab);
			Thread.sleep(3000);
		}
			
		 Set<String>windows=driver.getWindowHandles();
		 
		 Iterator<String>  it = windows.iterator();
		 
		 while(it.hasNext())
		 {
			 driver.switchTo().window(it.next());
			 System.out.println(driver.getTitle());
			 
			 
		 }
		 
			
			
		
		
		
		
		
		

	}

}
