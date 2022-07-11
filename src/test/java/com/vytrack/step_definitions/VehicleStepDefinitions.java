package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.TestBasePageOthers;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VehicleStepDefinitions {

    LoginPage loginPage = new LoginPage();
    TestBasePageOthers testBasePageOthers = new TestBasePageOthers();
    @Given("user is on the Home Page")
    public void user_is_on_the_home_page() {
        loginPage.logIn("storemanager");
    }
    @When("user gets on the Vehicles Page")
    public void user_gets_on_the_vehicles_page() {
        testBasePageOthers.moduleFeatures("Fleet","Vehicle");
    }
    @Then("User should be able to see export grid on left side of the page")
    public void user_should_be_able_to_see_export_grid_on_left_side_of_the_page() {
        WebElement l = Driver.getDriver().findElement(By.xpath("//a[contains(@title,'exported')]"));
        int x = l.getLocation().getX();

        WebElement page= Driver.getDriver().findElement(By.xpath("//label[text()='Page:']"));
        int x2=page.getLocation().getX();


        Assert.assertTrue("It is not on the left side",x2>x);
    }
}
