package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationAlert {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
	a.get("http://demo.automationtesting.in/Alerts.html");
	a.manage().window().maximize();
	WebElement txtalert = a.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	txtalert.click();
	WebElement getalert = a.findElement(By.xpath("(//button[@class='btn btn-info'])"));
	getalert.click();
	Alert s = a.switchTo().alert();
	s.sendKeys("vickey");
	s.accept();
}
}
