package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatLead extends BaseTest{
	@Test
	public  void createNewLead() {
		
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("InvestorsUnion");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajith");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Knowledge is Power");
		
		driver.findElement(By.id("createLeadForm_importantNote")).clear();
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Knowledge");
		
		driver.findElement(By.name("submitButton")).click();
		
		
	}

}
