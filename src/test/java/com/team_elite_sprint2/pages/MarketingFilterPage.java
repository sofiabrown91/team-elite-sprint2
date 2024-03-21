package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MarketingFilterPage {


    public MarketingFilterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//div[@class='btn-group dropdown']//input")
    public WebElement selectAllCheckbox;


    @FindBy(xpath = "//input[@tabindex='-1']")
    public List<WebElement> allCheckboxes;


    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;

    @FindBy(xpath = "//a[@class='add-filter-button']")
    public List<WebElement> filterOptions;

}
