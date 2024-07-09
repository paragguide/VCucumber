package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationTest extends Hook
{
	
	@Given("i launch browser {string} with url {string} test name {string} report name {string}")
	public void i_launch_browser_with_url_test_name_report_name(String browser, String url, String testname, String reportname) throws Exception 
	{
	    openBrowser(browser,url,testname,reportname);
	}
	@Given("take mouse over to sign in and click start here")
	public void take_mouse_over_to_sign_in_and_click_start_here() 
	{
	   Actions a = new Actions(driver);
	   a.moveToElement(signin).perform();
	   
	   driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a")).click();
	}
	@When("i enter name {string} with mobile number {string} and create password {string} and click submit")
	public void i_enter_name_with_mobile_number_and_create_password_and_click_submit(String name, String mob, String pwd) 
	{
	    driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys(name);
	    driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]")).sendKeys(mob);
	    driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(pwd);
	    driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).click();
	}
	@Then("OTP should come")
	public void otp_should_come() 
	{
	    
	}



}
