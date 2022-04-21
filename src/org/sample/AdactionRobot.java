package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactionRobot {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver a = new ChromeDriver();
	a.get("https://adactinhotelapp.com/");
	Robot s = new Robot();
	s.keyPress(KeyEvent.VK_TAB);
	s.keyRelease(KeyEvent.VK_TAB);
	s.keyPress(KeyEvent.VK_TAB);
	s.keyRelease(KeyEvent.VK_TAB);	
	s.keyPress(KeyEvent.VK_TAB);
	s.keyRelease(KeyEvent.VK_TAB);
	s.keyPress(KeyEvent.VK_SHIFT);
	s.keyPress(KeyEvent.VK_V);
	s.keyRelease(KeyEvent.VK_V);
	s.keyRelease(KeyEvent.VK_SHIFT);
	s.keyPress(KeyEvent.VK_I);
	s.keyRelease(KeyEvent.VK_I);
	s.keyPress(KeyEvent.VK_C);
	s.keyRelease(KeyEvent.VK_C);
	s.keyPress(KeyEvent.VK_K);
	s.keyRelease(KeyEvent.VK_K);
	s.keyPress(KeyEvent.VK_E);
	s.keyRelease(KeyEvent.VK_E);
	s.keyPress(KeyEvent.VK_Y);
	s.keyRelease(KeyEvent.VK_Y);	
	s.keyPress(KeyEvent.VK_TAB);
	s.keyRelease(KeyEvent.VK_TAB);
	s.keyPress(KeyEvent.VK_SHIFT);
	s.keyPress(KeyEvent.VK_A);
	s.keyRelease(KeyEvent.VK_A);
	s.keyRelease(KeyEvent.VK_SHIFT);
	s.keyPress(KeyEvent.VK_B);
	s.keyRelease(KeyEvent.VK_B);
	s.keyPress(KeyEvent.VK_C);
	s.keyRelease(KeyEvent.VK_C);
	s.keyPress(KeyEvent.VK_SHIFT);
	s.keyPress(KeyEvent.VK_2);
	s.keyRelease(KeyEvent.VK_2);
	s.keyRelease(KeyEvent.VK_SHIFT);
	s.keyPress(KeyEvent.VK_1);
	s.keyRelease(KeyEvent.VK_1);
	s.keyPress(KeyEvent.VK_2);
	s.keyRelease(KeyEvent.VK_2);
	s.keyPress(KeyEvent.VK_3);
	s.keyRelease(KeyEvent.VK_3);
	s.keyPress(KeyEvent.VK_TAB);
	s.keyRelease(KeyEvent.VK_TAB);
	s.keyPress(KeyEvent.VK_TAB);
	s.keyRelease(KeyEvent.VK_TAB);
	s.keyPress(KeyEvent.VK_ENTER);
	s.keyRelease(KeyEvent.VK_ENTER);
}
}
