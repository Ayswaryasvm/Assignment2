package assignment2.sun;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		boolean b = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		if (b != true) {
			System.out.println("key is enabled");
		} else {
			System.out.println("key is disabled");
		}
		Point loc = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println("location  " + loc);
		String buttonclr = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background");
		System.out.println("Color is  " + buttonclr);
		Rectangle rect = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getRect();
		System.out.println("Height " + rect.getHeight());
		System.out.println("Width  " + rect.getWidth());
		driver.close();
	}

}
