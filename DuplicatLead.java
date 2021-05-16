package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicatLead	extends BaseTest {
	@Test
	public  void duplicateNewLead() {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Finance");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aji");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("th");
		
		driver.findElement(By.id("createLeadForm_description")).clear();
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Knowledge is Power");
		
		driver.findElement(By.id("createLeadForm_importantNote")).clear();
		
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Knowledge");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New");
		
		driver.findElement(By.name("submitButton")).click();
		
		
	}

}
