package com.allainz.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signupFB {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.linkText("Create new account")).click();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.findElement(By.name("firstname")).sendKeys("Demo");
		 
		 driver.findElement(By.name("lastname")).sendKeys("new");
		 
		driver.findElement(By.name("reg_email__")).sendKeys("demo@gmail.com");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("demo@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Demon@7385");
		 
		Select selectDay = new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("29");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Select selectMonth = new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Oct");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 Select selectYear = new Select(driver.findElement(By.id("year")));
		 selectYear.selectByVisibleText("1995");
		 
		 driver.findElement(By.xpath("//input[@value='2']")).click();
		 
		
		 driver.findElement(By.name("websubmit")).click();
		
	}

}
