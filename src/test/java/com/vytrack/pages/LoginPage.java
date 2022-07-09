package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement username;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement logInbtn;

    @FindBy(xpath = "//span[@class='custom-checkbox__icon']")
    public WebElement rememberMe;

    @FindBy(xpath = "//a[contains(text(),'Forgot')]")
    public WebElement forgotPswrd;

    public void logIn(String userNameAdd){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        username.sendKeys(ConfigurationReader.getProperty(userNameAdd));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        logInbtn.click();
    }
}
