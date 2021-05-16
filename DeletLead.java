package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeletLead extends BaseTest{
	

	@Test(enabled=false)
	public  void newdeleteLead() {
		
		
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Ajith");
		
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Kumar");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=11185']")).click();
		
		driver.findElement(By.linkText("Delete")).click();
		
			

	}

}
