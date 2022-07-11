package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
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

    /**
     * This method allows you to easily click 2 line of feature
     * Example: Sales->Leads
     */
    public void moduleFeatures(String module, String feature){
        BrowserUtils.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        WebElement moduleElement = Driver.getDriver().findElement(By.xpath("(//li[contains(@class,' dropdown-level-1')]//span[contains(text(),'" + module +"')])[1]"));
        actions.moveToElement(moduleElement).perform();

        WebElement featureElement=Driver.getDriver().findElement(By.xpath("(//li[contains(@class,' dropdown-level-1')]//span[contains(text(),'"+ module +"')])[1]/../..//div//a//span[contains(text(),'" + feature +"')]"));
        actions.moveToElement(featureElement).click().perform();


    }


    /**
     * This method allows you to easily click 3 line of subfeature
     * Example: System->Entities->Car
     */
    public void moduleWithSubFeatures(String module, String feature,String subFeature){
        BrowserUtils.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        WebElement element = Driver.getDriver().findElement(By.xpath("(//li[contains(@class,' dropdown-level-1')]//span[contains(text(),'" + module +"')])[1]"));
        actions.moveToElement(element).perform();

        WebElement featureElement=Driver.getDriver().findElement(By.xpath("(//li[contains(@class,' dropdown-level-1')]//span[contains(text(),'"+module+"')])[1]/../..//div//a//span[contains(text(),'"+feature+"')]"));

        actions.moveToElement(featureElement).perform();

        WebElement sub=Driver.getDriver().findElement(By.xpath("((//li[contains(@class,' dropdown-level-1')]//span[contains(text(),'"+module+"')])[1]/../..//div//a//span[contains(text(),'"+feature+"')])[1]//..//..//li//a//span[contains(text(),'"+subFeature+"')]"));
        actions.moveToElement(sub).click().perform();

    }

    /**
     * This method allows you to easily click 4 line of subfeature
     * Example: Reports&Segments->Reports->Accounts->Life Time
     */
    public void moduleWithThreeSubFeatures(String module, String feature,String subFeature,String lowestFeature){
        BrowserUtils.waitFor(3);
        Actions actions = new Actions(Driver.getDriver());
        WebElement element = Driver.getDriver().findElement(By.xpath("(//li[contains(@class,' dropdown-level-1')]//span[contains(text(),'" + module +"')])[1]"));
        actions.moveToElement(element).perform();

        WebElement featureElement=Driver.getDriver().findElement(By.xpath("(//li[contains(@class,' dropdown-level-1')]//span[contains(text(),'"+module+"')])[1]/../..//div//a//span[contains(text(),'"+feature+"')]"));

        actions.moveToElement(featureElement).perform();

        WebElement sub=Driver.getDriver().findElement(By.xpath("((//li[contains(@class,' dropdown-level-1')]//span[contains(text(),'"+module+"')])[1]/../..//div//a//span[contains(text(),'"+feature+"')])[1]//..//..//li//a//span[contains(text(),'"+subFeature+"')]"));

        actions.moveToElement(sub).perform();

        WebElement lowest=Driver.getDriver().findElement(By.xpath("((//li[contains(@class,' dropdown-level-1')]//span[contains(text(),'"+module+"')])[1]/../..//div//a//span[contains(text(),'"+feature+"')])[1]//..//..//li//a//span[contains(text(),'"+subFeature+"')]//..//following-sibling::ul//a//span[contains(text(),'"+lowestFeature+"')]"));

       actions.moveToElement(lowest).click().perform();


    }

    public void userMenuOption(String options){

        userMenu.click();
        Driver.getDriver().findElement(By.xpath("//ul[@class='dropdown-menu']//a[text()='"+ options +"']")).click();

    }


}
