package assignment2.sun;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		driver.findElement(By.xpath("(//h5[text()='Choose your favorite language(s)']/following::div)[11]")).click();
		driver.findElement(By.xpath("(//h5[text()='Tri State Checkbox']/following::div)[3]")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		WebElement radio = driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/following::div[5]"));
		System.out.println(radio.isEnabled());
		if (!radio.isEnabled())

			System.out.println("checkbox disable");
		else
			System.out.println("checkbox enable");
		driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::div[4]")).click();

		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		driver.close();
	}
}
