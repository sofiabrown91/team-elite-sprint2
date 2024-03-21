package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vehicle_Contracts_page extends BasePage{

    public Vehicle_Contracts_page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement accessDeniedMsg;


}
