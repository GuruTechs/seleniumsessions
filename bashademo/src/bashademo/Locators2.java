package bashademo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {

		String name = "rahul";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getpasswordtext(driver);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);

		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ",");

		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	}

	public static String getpasswordtext(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		String passwordText = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();

		String[] passwrdarray = passwordText.split("'");
		String Actualpswd = passwrdarray[1].split("'")[0];
		return Actualpswd;

	}

}
