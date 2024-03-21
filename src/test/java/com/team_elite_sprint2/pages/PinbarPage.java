package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPage extends BasePage{

    public PinbarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[.='Learn how to use this space']")
    public WebElement pinbarLink;

    @FindBy (xpath = "//h3[.='How To Use Pinbar']")
    public WebElement howToUsePinbarHeader;

    @FindBy (xpath = "//p[contains(text(),'pin icon')]")
    public WebElement pinbarInstructions;

    @FindBy (xpath = "//img")
    public WebElement exampleImage;

}
