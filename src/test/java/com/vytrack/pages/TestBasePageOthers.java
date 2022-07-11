package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestBasePageOthers {

    public TestBasePageOthers() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "#user-menu>a")
    public WebElement userMenu;

    @FindBy (xpath = "//i[@class='mail-icon']")
    public WebElement mailIcon;

    @FindBy (css = ".fa-bars")
    public WebElement barMenu;

    @FindBy (css = ".fa-question-circle")
    public  WebElement question;

    public void moduleFeatures(String module, String feature){

        Actions actions = new Actions(Driver.getDriver());
        WebElement element = Driver.getDriver().findElement(By.xpath("(//li[contains(@class,' dropdown-level-1')]//span[contains(text(),'" + module +"')])[1]"));
        actions.moveToElement(element).perform();

        Driver.getDriver().findElement(By.xpath("(//li[contains(@class,' dropdown-level-1')]//span[contains(text(),'"+ module +"')])[1]/../..//div//a//span[contains(text(),'" + feature +"')]")).click();

    }



    public void userMenuOption(String options){

        userMenu.click();
        Driver.getDriver().findElement(By.xpath("//ul[@class='dropdown-menu']//a[text()='"+ options +"']")).click();

    }


}
