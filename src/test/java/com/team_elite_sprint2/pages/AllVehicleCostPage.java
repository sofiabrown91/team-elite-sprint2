package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AllVehicleCostPage extends BasePage {

    public AllVehicleCostPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class='grid-header-cell__link']")
    public List<WebElement> filterRows;

    @FindBy(xpath = "//div[@class='btn-group dropdown']//input")
    public WebElement selectAllCheckbox;

    @FindBy(xpath = "//input[@tabindex='-1']")
    public List<WebElement> allCheckboxes;

    @FindBy(css = ".oro-subtitle")
    public WebElement h1AllVehicleCost;



}
