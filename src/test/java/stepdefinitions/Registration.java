package stepdefinitions;





import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Registration {
	
	public WebDriver dr;
	public Properties prop;
	public FileInputStream fis;
	public FileInputStream fis1;
	Logger log = Logger.getLogger(Registration.class);
	
	
	
	
	
	
	
	@Before("@tagreg")
	
	
	public void before() {
		
		try {
			fis=new FileInputStream("C:\\Users\\001ZBY744\\eclipse-workspace\\project\\src\\main\\resources\\prop\\object.properties");
			fis1=new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//prop//object.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prop=new Properties();
		try {
			prop.load(fis1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("url1"));
		System.out.println("before executing");
		System.getProperty("user.dir");
		System.out.println(System.getProperty("user.dir"));
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\001ZBY744\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
	//    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//chromedriver.exe");
		dr=new ChromeDriver();
	//	dr.get("http://uitestingplayground.com/");
		dr.get(prop.getProperty("url1"));
		dr.manage().window().maximize();
	//	dr.findElement(By.xpath(prop.getProperty("login"))).click();
		
	//	PropertyConfigurator.configure("C:\\Users\\001ZBY744\\eclipse-workspace\\project\\log4j.properties");
	PropertyConfigurator.configure(System.getProperty("user.dir")+"//log4j.properties");
	log.info("initializations done and url http://elearningm1.upskills.in/index.php is getting opened");
		
	}
	
	
	
	
	@Given("http:\\/\\/elearningm{int}.upskills.in\\/index.php the_url_opened")
	public void http_elearningm_upskills_in_index_php_the_url_opened(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("background is executed");
		log.info("clicking sign up button for registration");
		dr.findElement(By.xpath(prop.getProperty("signin"))).click();
		
	   
	}

	@When("user clicks signup button")
	public void user_clicks_signup_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("signup click is executed");
		log.info("user clicks signup button");
	    
	}

	@Then("user fills the form with values {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void user_fills_the_form_with_values(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("signup form is filled  is executed");
		log.info("user fills the form with values");
		dr.findElement(By.xpath(prop.getProperty("fname"))).sendKeys("john");
		dr.findElement(By.xpath(prop.getProperty("lname"))).sendKeys("doe");
		dr.findElement(By.xpath(prop.getProperty("email"))).sendKeys("john.doe@yopmail.com");
		dr.findElement(By.xpath(prop.getProperty("uname"))).sendKeys("john");
		dr.findElement(By.xpath(prop.getProperty("pwd"))).sendKeys("john@123");
		dr.findElement(By.xpath(prop.getProperty("cpwd"))).sendKeys("john@123");
		
	}

	@Then("user clicks register button")
	public void user_clicks_register_button() {
		System.out.println("signup form registered is executed");
		log.info("user clicks register button");
		dr.findElement(By.xpath(prop.getProperty("reg"))).click();
	String exp=	dr.findElement(By.xpath(prop.getProperty("assert1"))).getText();
		
		Assert.assertEquals(exp, dr.findElement(By.xpath(prop.getProperty("assert1"))).getText());
		System.out.println(exp+ "---expected value is ------");
	    
	}
	
	@After("@tagreg")
	
	public void after() {
		
		log.info("closing the first browser tagged to the scenario");
		
		dr.close();
		
	}
}
