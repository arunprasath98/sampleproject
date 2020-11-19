package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefinition {
	WebDriver driver;
	@Given("user is on facebook")
	public void user_is_on_facebook() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	   
	}

	@When("user is going to enter {string} and {string}")
	public void user_is_going_to_enter_and(String string, String string2) {
	    driver.findElement(By.id("email")).sendKeys(string);
	    driver.findElement(By.id("pass")).sendKeys(string2);
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("user should verify by seeing home page")
	public void user_should_verify_by_seeing_home_page() {
	    System.out.println("invalid home page");
	}




}
