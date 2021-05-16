package week5.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergLead extends BaseTest{
	@Test
	public  void newMergeLead() throws InterruptedException {
		
		driver.findElement(By.linkText("Merge Leads")).click();
		
		driver.findElement(By.id("ComboBox_partyIdFrom")).clear();
		driver.findElement(By.id("ComboBox_partyIdFrom")).sendKeys("Ajith");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='dijitMenuItem'])[2]")).click();
		
		driver.findElement(By.id("ComboBox_partyIdTo")).clear();
		driver.findElement(By.id("ComboBox_partyIdTo")).sendKeys("Aji");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("div#widget_ComboBox_partyIdTo_dropdown>div>div:nth-of-type(2)")).click();
		
		driver.findElement(By.linkText("Merge")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String errorMessage = driver.findElement(By.className("errorMessage")).getText();
		System.out.println(errorMessage);
		
	
		
		
		
		
		

	}

}
