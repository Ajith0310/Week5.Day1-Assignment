package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EdiLead extends BaseTest{
	@Test
	public  void editnewLead() {
		
		
	
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Finance");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aji");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("th");
		
		driver.findElement(By.id("createLeadForm_description")).clear();
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Knowledge is Power");
		
		driver.findElement(By.id("createLeadForm_importantNote")).clear();
		
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Knowledge");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("ADS");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
		
	}

}
