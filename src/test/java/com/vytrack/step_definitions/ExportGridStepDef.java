package com.vytrack.step_definitions;


import com.vytrack.pages.ExportGridPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.TestBasePageOthers;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ExportGridStepDef {
    LoginPage loginPage = new LoginPage();
    TestBasePageOthers testBasePageOthers = new TestBasePageOthers();

    ExportGridPage exportGridPage = new ExportGridPage();



    @Given("i am on the login page")
    public void i_am_on_the_login_page() {
        loginPage.logIn("storemanager");


    }
    @When("i click on fleet module and vehicle")
    public void i_click_on_fleet_module() {
        testBasePageOthers.moduleFeatures("Fleet", "Vehicles");


    }
    @Then("i can click export grid dropdown")
    public void i_can_click_export_grid_dropdown() throws IOException {
        exportGridPage.exportGridBtn.click();

        File source = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("C:\\Users\\aydog\\Downloads\\VyTrack Store Manager\\ScreenShot1.png"));


    }


}
