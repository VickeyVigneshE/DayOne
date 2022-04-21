package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazontxt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver a= new ChromeDriver();
		a.get("https://www.amazon.in/");
		WebElement gettxt = a.findElement(By.xpath("//a[contains(text(),'Conditions of Use & Sale')]"));
		String text = gettxt.getText();
		System.out.println(text);
		a.quit();
		
}}
