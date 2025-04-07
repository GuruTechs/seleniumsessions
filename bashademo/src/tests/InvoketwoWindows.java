package tests;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvoketwoWindows {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		//switching the windows
		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();

		driver.switchTo().window(childwindow);
		driver.get("https://rahulshettyacademy.com/");
		
		String courseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		
		driver.switchTo().window(parentwindow);
		WebElement name=driver.findElement(By.name("name"));
		name.sendKeys(courseName);
		// capturing screenshot of a web element
		File file=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		
		// capturing height and width of a web element
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		

	}

}
