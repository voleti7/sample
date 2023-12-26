package com.sample.sample.stepDefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.loginqa;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class StepDefinition {

     private WebDriver driver;
     loginqa qa;



    @Before
    public void setup() {
        System.out.println("Into the setup method of...");
        this.driver = Hooks.getChromeWebDriver();
         qa =new loginqa(driver);
    }


    @Given("Load URL")
    public void Load_URL() {

    driver.get("https://vsmdev.swaviktech.com/");

    }

    @When("I enter username and passward")
    public void i_enter_username_and_passward() {
    qa.username().sendKeys("test@vsm.com");
    qa.password().click();
    Actions action =new Actions(driver);
    action.sendKeys(qa.password(), "Password@2023").build().perform();


    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        qa.loginButton().click();
    }


    @When("I verify dashboard")
    public void i_verify_dashboard() throws InterruptedException {

        qa.logoutButton().click();

    }


    @Then("I click on logout button")
    public void I_click_on_logout_button() throws InterruptedException {


        qa.logoutButton().click();


    }



    @After
    public void cleanUp() {

     //   Hooks.releaseResources();
    }



}
