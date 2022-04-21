package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactinHoteltxt {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver a= new ChromeDriver();
	a.get("https://adactinhotelapp.com/");
	WebElement gettxt = a.findElement(By.xpath("//p[contains(text(),'Adactin Launches')]"));
	String text = gettxt.getText();
	System.out.println(text);
	a.quit();
	
}
}
