package com.allainz.basic;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class salesForceSignup {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver.manage().window().maximize();

		 driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5)); 
		
		driver.findElement(By.name("UserFirstName")).sendKeys("john");
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		
		driver.findElement(By.name("UserEmail")).sendKeys("johnw23@gmail.com");
		Select selectTitle = new Select(driver.findElement(By.name("UserTitle")));
		selectTitle.selectByVisibleText("IT Manager");
		
		driver.findElement(By.name("CompanyName")).sendKeys("Allianz");
		
		Select selectEmp = new Select(driver.findElement(By.name("CompanyEmployees")));
		selectEmp.selectByVisibleText("101 - 200 employees");
		
		driver.findElement(By.name("UserPhone")).sendKeys("8798767878");
		
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
	}

}
