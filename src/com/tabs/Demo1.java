package com.tabs;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		 
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://db4free.net");
        
        driver.findElement(By.linkText("phpMyAdmin »")).click();
        
        ArrayList<String> = windows new ArrayList<String>(driver.getWindowHandles()); 
        driver.switchTo().window(windows.get(1));
	}

}
