import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AngularPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Divya Agrawal");
		driver.findElement(By.name("email")).sendKeys("divya124@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Divya123");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("exampleCheck1")).isSelected();
		WebElement staticdropdown = driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		driver.findElement(By.xpath("//input[@value='option1']")).isEnabled();
		driver.findElement(By.name("bday")).click();
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
	    System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		

	}

}
