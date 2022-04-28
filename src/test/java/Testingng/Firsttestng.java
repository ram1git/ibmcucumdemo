package Testingng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firsttestng {
	
	public WebDriver dr;
	
	@BeforeTest
	
	
	public void before() {
	
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\001ZBY744\\Downloads\\chromedriver_win32-1\\chromedriver.exe");
		 dr=new ChromeDriver();
		 dr.get("https://www.moneycontrol.com");
		 
		
	}
	
	
	@Test
	
	public void test() {
		
		System.out.println("hello");
		
	}

}
