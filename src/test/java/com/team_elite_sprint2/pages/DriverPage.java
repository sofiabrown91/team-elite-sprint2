package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DriverPage {
  public DriverPage(){
        PageFactory.initElements(Driver.getDriver() , this);
}

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement message ;
}


