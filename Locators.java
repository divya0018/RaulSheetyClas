import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("divya");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Divya");//Tagname[@attribute = 'value']
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("divyacs0018@gmail.com");//tagname[@attribute = 'value'][index]
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9670084410");//parenttagname/childtagname[index]
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("divya");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	
	}


}
