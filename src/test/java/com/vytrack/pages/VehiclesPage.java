package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage {

    public VehiclesPage() {PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetClass;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesClass;

    @FindBy(xpath = "//i[@class='fa-repeat']")
    public WebElement refreshButton;


    public void refresh() throws InterruptedException {

        fleetClass.click();

        vehiclesClass.click();

        Thread.sleep(3000);

        refreshButton.click();
    }

    public void verify(){

       WebElement expectedrefreshBtn = Driver.getDriver().findElement(By.xpath("//div[@class='loader-mask shown']"));

       Assert.assertTrue(refreshButton.isDisplayed());



    }


}

