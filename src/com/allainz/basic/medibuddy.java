package com.allainz.basic;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class medibuddy {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.medibuddy.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		

	}

}
