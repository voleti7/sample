package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginqa {



    public WebDriver driver;

    public loginqa(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//*[@id='root']/div/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div/input")
    WebElement username;
    public WebElement username() {return username;}


    @FindBy(xpath = "//*[@id='root']/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div")
    WebElement password;
    public WebElement password() {
        return password;
    }


    @FindBy(xpath = "//*[@id='root']/div/div[2]/div/div[2]/div/div[2]/button")
    WebElement loginButton;
    public WebElement loginButton() {
        return loginButton;
    }



    @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/img ")
    WebElement logoutButton;
    public WebElement logoutButton() {return logoutButton;}











}
