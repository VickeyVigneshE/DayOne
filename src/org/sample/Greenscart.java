package org.sample;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greenscart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
	a.get("http://greenscart.in/#/");
	a.manage().window().maximize();
	a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement username = a.findElement(By.id("loginEmailId"));
	username.sendKeys("vickey281099@gmail.com");
	WebElement pass = a.findElement(By.id("loginPassword"));
	pass.sendKeys("Vickey@2805");
	WebElement login = a.findElement(By.xpath("//input[@value='Login']"));
	login.click();
	WebElement seemore = a.findElement(By.xpath("//a[@class='btn btn-default float-right']"));
	seemore.click();
	WebElement sltproduct = a.findElement(By.xpath("(//img[@class='card-img-top'])[1]"));
	sltproduct.click();
	WebElement buynow = a.findElement(By.xpath("(//button[@class='btn btn-warning btn-long buy buttonKart'])[1]"));
	buynow.click();
	WebElement getcode = a.findElement(By.xpath("(//button[@class='btn btn-block btn-outline-primary btn-lg'])[1]"));
	getcode.click(); 
	Thread.sleep(3000);
	Actions s = new Actions(a);
	WebElement doubleclk = a.findElement(By.xpath("(//span[@class='border border-success px-3 rounded code'])[1]"));
	s.doubleClick(doubleclk).perform();
	Thread.sleep(3000);
	WebElement rightclk = a.findElement(By.xpath("(//span[@class='px-1 close'])[1]"));
	s.contextClick(rightclk).perform();
	WebElement remove = a.findElement(By.xpath("//div[contains(text(),'Remove Promo Code ')]"));
	remove.click();
}
}
