package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CampaignsPageUS15 extends BasePage {

    public CampaignsPageUS15(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".add-filter-button")
    public WebElement manageFiltersButton;


    @FindBy(css = ".fa-filter.hide-text")
    public WebElement filterButton;

    @FindBy(css = ".ui-multiselect-checkboxes.ui-helper-reset.fixed-li input")
    public List<WebElement> manageFiltersOptions;



}
