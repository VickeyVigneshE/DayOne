package org.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprinttxt {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
	WebDriver a = new ChromeDriver();
	a.get("https://www.t-mobile.com/?src=spr&rdpage=/");
	a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement cancle1 = a.findElement(By.xpath("//button[@class='tntOverlayCloseBtn']"));
	cancle1.click();
	WebElement cancle = a.findElement(By.xpath("(//button[@class='phx-modal__close'])[1]"));
	cancle.click();
	Actions s = new Actions(a);
	WebElement devices = a.findElement(By.xpath("(//button[@class='unav-header__toggle'])[2]"));
	s.moveToElement(devices);
	WebElement mobile = a.findElement(By.xpath("//a[contains(text(),'5G phones')]"));
	mobile.click();
	WebElement gettxt = a.findElement(By.xpath("//a[@id='digital-footer-bottom-link-bottom-9']"));
	String text = gettxt.getText();
	System.out.println(text);
	a.quit();
}
}
