package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarOdometerPage {

    public CarOdometerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='number']")
    public WebElement defaultPage;

    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[1]")
    public WebElement viewPerPage;

}
