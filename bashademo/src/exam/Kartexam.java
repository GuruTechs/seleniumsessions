package exam;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Kartexam {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(7000));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		driver.findElement(By.id("okayBtn")).click();
	
		
		
		WebElement selectitem=driver.findElement(By.cssSelector("select.form-control"));
		
		Select dropdown=new Select(selectitem);
		dropdown.selectByValue("consult");
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText("Checkout")));
		
		List<WebElement> items=driver.findElements(By.cssSelector(".card-footer"));
		
		for(int i=0; i<items.size(); i++)
		{
			items.get(i).click();
		}
		
	     driver.findElement(By.partialLinkText("Checkout")).click();

	     File scr=driver.findElement(By.xpath("dsfs")).getScreenshotAs(OutputType.FILE);
	     
	     
	     
	}

	

}
