package stepdefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	
	public WebDriver dr;
	public Properties prop;
	public FileInputStream fis;
	
	
	@Before("@tag12")
	
	
	public void before() {
		try {
			fis=new FileInputStream("C:\\Users\\001ZBY744\\eclipse-workspace\\project\\src\\main\\resources\\prop\\object.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("url"));
		System.out.println("before executing");
		System.getProperty("user.dir");
		System.out.println(System.getProperty("user.dir"));
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\001ZBY744\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
	//    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver.exe");
		dr=new ChromeDriver();
	//	dr.get("http://uitestingplayground.com/");
		dr.get(prop.getProperty("url"));
	//	dr.findElement(By.xpath(prop.getProperty("login"))).click();
		
		
	}
	
	@Given("my login page {string} is opened")
	public void my_login_page_is_opened(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("background is executed");
	    
	}

	@Given("I want to click dynamic id button on the page")
	public void i_want_to_click_dynamic_id_button_on_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("first step is executed");
	    
	}

	@Given("verify the same")
	public void verify_the_same() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("second step is executed");
	   
	}

	@Then("assert the same with some value")
	public void assert_the_same_with_some_value() {
		System.out.println("third step is executed");
	    
	}

	@When("I provide {string} and {string}")
	public void i_provide_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string+"val");
	    System.out.println(string2+"val2");
	}


	@Then("open")
	public void open() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("close")
	public void close() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	
	@After("@tag12")
	
	public void aftertest() {
		
		System.out.println("browser is getting closed  step is executed");
		
	//	dr.close();
	}

}
