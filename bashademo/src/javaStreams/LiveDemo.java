/**
 * 
 */
package javaStreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	
	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> elementList=driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originalList=elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		//getting price of the beans
		List<String> price=elementList.stream().filter(s->s.getText().contains("Beans")
				 ).map(s->getPriceveggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		

	}

	
	private static String  getPriceveggie(WebElement s) 
	{
		String beansprice=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return beansprice;
	}

}
