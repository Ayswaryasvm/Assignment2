package assignment2.sat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LtCreateAcoount {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.\r\n");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Ayswarya");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement enumDD = driver.findElement(By.name("industryEnumId"));
		Select sec1 = new Select(enumDD);
		sec1.selectByIndex(3);
		WebElement ownerDD = driver.findElement(By.name("ownershipEnumId"));
		Select sec2 = new Select(ownerDD);
		sec2.selectByVisibleText("S-Corporation");
		WebElement dataDD = driver.findElement(By.id("dataSourceId"));
		Select sec3 = new Select(dataDD);
		sec3.selectByValue("LEAD_EMPLOYEE");
		WebElement markDD = driver.findElement(By.id("marketingCampaignId"));
		Select sec4 = new Select(markDD);
		sec4.selectByIndex(6);
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sec5 = new Select(stateDD);
		sec5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();

	}

}
