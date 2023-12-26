package com.sample.sample.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.spring.CucumberContextConfiguration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@CucumberContextConfiguration
@SpringBootTest
public class Hooks {


   private static final Logger logger = (Logger) LogManager.getLogger(Hooks.class);

    public static WebDriver driver;


    @Given("Load the browser")
    public void Load_the_browser() {

           }

    public static WebDriver getChromeWebDriver () {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/windows/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("test-type");
       options.addArguments("disable-popup-blocking");
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        return driver;
    }


    public static void releaseResources() {
        System.out.println("Releasing resources now.....");
        if (null != driver) {
            driver.close();
            driver.quit(); //CLOSES ALL THE OPEN BROWSER SESSIONS LEAVING OTHER STEP EXECUTIONS INCOMPLETE
        }
    }


    }

