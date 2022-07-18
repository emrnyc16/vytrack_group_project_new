package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.TestBasePageOthers;
import com.vytrack.pages.VehiclesPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;

public class ClickingRefreshButton {

    LoginPage loginPage=new LoginPage();
    TestBasePageOthers testBasePageOthers = new TestBasePageOthers();

    VehiclesPage vehiclesPage = new VehiclesPage();
    @Given("User is on the Vytrack main vehicles page")
    public void user_is_on_the_vytrack_main_vehicles_page() {
    loginPage.logIn("storemanager");
    }

    VehiclesPage refreshButtonPage = new VehiclesPage();
    @When("User click the refresh button")
    public void user_click_the_refresh_button() throws InterruptedException {

    testBasePageOthers.moduleFeatures("Fleet","Vehicles");

    Thread.sleep(2000);

    vehiclesPage.refreshButton.click();

    }
    @Then("the entire vehicles page should refresh")
    public void the_entire_vehicles_page_should_refresh() throws IOException {

    Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div[@class='loader-mask shown']")).isDisplayed());


    //refreshButtonPage.verify();



    }

}
