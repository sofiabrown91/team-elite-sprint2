package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleModelPage {
    public VehicleModelPage(){

        PageFactory.initElements(Driver.getDriver() , this);
    }


    @FindBy (xpath = "//a[@class='grid-header-cell__link' ]/span[1]")
    public List<WebElement> columns ;
}


