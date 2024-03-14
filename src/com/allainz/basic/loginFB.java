package com.allainz.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
			
		 driver.findElement(By.id("email")).sendKeys("aniket@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("aniket@123");
		 
		 driver.findElement(By.name("login")).click();
	}

}
