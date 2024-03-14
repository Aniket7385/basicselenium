package com.allainz.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class citybank {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.citibank.co.in/ssjsps/forgetuserid.jsp");
		
		driver.findElement(By.linkText("select your product type")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Credit Card")).click();
		
		driver.findElement(By.id("citiCard1")).sendKeys("4545");
		driver.findElement(By.id("citiCard2")).sendKeys("5656");
		driver.findElement(By.id("citiCard3")).sendKeys("8887");
		driver.findElement(By.id("citiCard4")).sendKeys("9998");

		driver.findElement(By.id("cvvnumber")).sendKeys("417");
		driver.findElement(By.xpath("//input[@value='dd/mm/yyyy']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Select selectYear = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		selectYear.selectByVisibleText("2022");
		
		Select selectMonth = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		selectMonth.selectByVisibleText("Apr");
		
		Select selectDay = new Select(driver.findElement(By.xpath("//td[contains(@class,'  ui-datepicker-current-day')]")));
		selectDay.selectByVisibleText("14");
	}

}
