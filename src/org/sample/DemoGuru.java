package org.sample;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuru {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
	a.get("https://demo.guru99.com/test/drag_drop.html");
	a.manage().window().maximize();
	a.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement dragbank = a.findElement(By.id("credit2"));
	WebElement dropbanks = a.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	WebElement dragamount = a.findElement(By.xpath("(//li[@id='fourth'])[2]"));
	WebElement dropamount = a.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	WebElement dragbank1 = a.findElement(By.id("credit1"));
	WebElement dropbanks1 = a.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	WebElement dragamount1 = a.findElement(By.xpath("(//li[@id='fourth'])[2]"));
	WebElement dropamounr1 = a.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	Actions s = new Actions(a);
	s.dragAndDrop(dragbank,dropbanks).perform();
	s.dragAndDrop(dragamount,dropamount).perform();
	s.dragAndDrop(dragbank1,dropbanks1).perform();
	s.dragAndDrop(dragamount1,dropamounr1).perform();
	WebElement printtxt = a.findElement(By.xpath("//a[text()='Perfect!']"));
	String text = printtxt.getText();
	System.out.println(text);
}
}
