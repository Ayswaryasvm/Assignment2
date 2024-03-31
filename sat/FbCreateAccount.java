package assignment2.sat;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbCreateAccount {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("Leaf");
		driver.findElement(By.name("reg_email__")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Welcome@123");

		WebElement dayDD = driver.findElement(By.id("day"));
		Select sec1 = new Select(dayDD);
		sec1.selectByIndex(4);

		WebElement monthDD = driver.findElement(By.id("month"));
		Select sec2 = new Select(monthDD);
		sec2.selectByVisibleText("Nov");

		WebElement yearDD = driver.findElement(By.id("year"));
		Select sec3 = new Select(yearDD);
		sec3.selectByValue("2018");

		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.close();

	}

}
