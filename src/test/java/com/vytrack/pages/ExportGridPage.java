package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExportGridPage {

    public ExportGridPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy (xpath ="//a[@title='With this button you will export the content of the grid as it appears to you, with filters and sorting applied. All pages will be exported.']")
    public WebElement exportGridBtn;
}
