package stepdefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registrationnew {
	
	
	public WebDriver dr;
	public Properties prop;
	public FileInputStream fis;
	public FileInputStream fis1;
	Logger log = Logger.getLogger(Registrationnew.class);
	
	
	
@Before("@tagregnew")
	
	
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
		dr.get(prop.getProperty("url2"));
	//	dr.findElement(By.xpath(prop.getProperty("login"))).click();
		
	//	PropertyConfigurator.configure("C:\\Users\\001ZBY744\\eclipse-workspace\\project\\log4j.properties");
	PropertyConfigurator.configure(System.getProperty("user.dir")+"//log4j.properties");
	log.info("initializations done and url http://retailm1.upskills.in/admin/index.php is getting opened");
		
	}
	
	
	
	@When("user logins with his credentials {string} and {string}")
	public void user_logins_with_his_credentials_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    dr.findElement(By.xpath(prop.getProperty("uname1"))).sendKeys(string);
	    dr.findElement(By.xpath(prop.getProperty("pwd1"))).sendKeys(string2);
	    dr.findElement(By.xpath(prop.getProperty("login1"))).click();
	    log.info("user logins with his credentials");
	}

	@When("lands on the dashboard page")
	public void lands_on_the_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
	WebElement wb=	dr.findElement(By.xpath(prop.getProperty("market")));
	Actions act=new Actions(dr);
	act.moveToElement(wb).build().perform();
	log.info("lands on the dashboard page");
	dr.findElement(By.xpath(prop.getProperty("menu"))).click();
String title=dr.getTitle();
System.out.println(title+"---page title is coupons");
Assert.assertEquals(title, "Coupons");
	
	
	   
	}

	@Then("user clicks coupons link on the page")
	public void user_clicks_coupons_link_on_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		dr.findElement(By.xpath(prop.getProperty("add"))).click();
		log.info("user clicks coupons link on the page");
	    
	}

	@When("user adds the coupons with {string} and {string} and then saves")
	public void user_adds_the_coupons_with_and_and_then_saves(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println(string);
		System.out.println(string2);
		dr.findElement(By.xpath(prop.getProperty("cpname"))).sendKeys(string);
		dr.findElement(By.xpath(prop.getProperty("code"))).sendKeys(string2);
		log.info("user clicks coupons link on the page");
	    
	}

	@Then("coupons names are successfully created")
	public void coupons_names_are_successfully_created() {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.xpath(prop.getProperty("save"))).click();
		log.info("coupons names are successfully created");
	    
	}

	@When("user edits the selected coupon and then saves the same")
	public void user_edits_the_selected_coupon_and_then_saves_the_same() {
	    // Write code here that turns the phrase above into concrete actions
		//*[@id="form-coupon"]/div/table/tbody/tr[13]/td[1]/input
		dr.findElement(By.xpath(prop.getProperty("select"))).click();
		log.info("user edits the selected coupon and then saves the same");
	    
	}

	@Then("the edited coupons are successfully saved")
	public void the_edited_coupons_are_successfully_saved() {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.xpath(prop.getProperty("edit"))).click();
		log.info("the edited coupons are successfully saved");
	}

	@When("user selcts the created coupn and deletes the same")
	public void user_selcts_the_created_coupn_and_deletes_the_same() {
	    // Write code here that turns the phrase above into concrete actions
		
		dr.findElement(By.xpath(prop.getProperty("cpname"))).sendKeys("asdf");
		dr.findElement(By.xpath(prop.getProperty("code"))).sendKeys("qwert");
		dr.findElement(By.xpath(prop.getProperty("save"))).click();
		log.info("user selcts the created coupn and deletes the same");
	    
	}

	@Then("coupon is successfully deleted")
	public void coupon_is_successfully_deleted() {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.xpath(prop.getProperty("select"))).click();
		dr.findElement(By.xpath(prop.getProperty("del"))).click();
		dr.switchTo().alert().accept();
		log.info("coupon is successfully deleted");
	    
	}


}
