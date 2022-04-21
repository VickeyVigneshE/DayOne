package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtxt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver a= new ChromeDriver();
		a.get("http://greenstech.in/selenium-course-content.html");
		WebElement over = a.findElement(By.xpath("//a[@id='overview-tab']"));
		over.click();
		WebElement gettxt = a.findElement(By.xpath("//p[contains(text(),'Selenium training class')]"));
		String text = gettxt.getText();
		System.out.println(text);
		a.quit();
		
}
}
