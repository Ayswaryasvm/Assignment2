package assignment2.sun;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		WebElement rb = driver.findElement(By.xpath("(//label[text()='Chrome'])[2]"));

		if (!rb.isSelected()) {
			System.out.println("Chrome selected");
		} else {
			System.out.println("chrome not selected");
		}
		WebElement rb1 = driver.findElement(By.xpath("(//label[text()='Firefox'])[2]"));
		if (!rb1.isSelected()) {
			System.out.println("FireFox selected");
		} else {
			System.out.println("FireFox not selected");
		}
		WebElement rb2 = driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		if (!rb2.isSelected()) {
			System.out.println("safari selected");
		} else {
			System.out.println("safari not selected");
		}
		WebElement rb3 = driver.findElement(By.xpath("(//label[text()='Edge'])[2]"));
		if (!rb3.isSelected()) {
			System.out.println("Edge selected");
		} else {
			System.out.println("Edge not selected");
		}
		WebElement radio = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		if (!radio.isSelected()) {
			System.out.println("21-40 Selected");
		} else {
			driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
		}
		driver.close();
	}
}