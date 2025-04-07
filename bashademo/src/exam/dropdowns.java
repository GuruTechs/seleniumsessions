package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.name("name")).sendKeys("shamsheer");
		driver.findElement(By.name("email")).sendKeys("shamsheer.basha75@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Shammu12");
		driver.findElement(By.id("exampleCheck1")).click();

		WebElement dropd = driver.findElement(By.id("exampleFormControlSelect1"));

		Select sel = new Select(dropd);
		sel.selectByVisibleText("Male");

		driver.findElement(By.xpath("//input[@value='option2']")).click();

		driver.findElement(By.name("bday")).sendKeys("14/09/1995");

		driver.findElement(By.cssSelector("input[type='submit']")).click();

		System.out.println(driver.findElement(By.className("alert-success")).getText());

	}

}
