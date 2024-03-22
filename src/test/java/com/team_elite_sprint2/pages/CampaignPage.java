package com.team_elite_sprint2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CampaignPage extends MarketingFilterPage{


    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFiltersAddFilterButton;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement btn_filter;


    @FindBy(xpath = "//input[contains(@id,'ui-multiselect')] ")
    public List<WebElement> filters;
}
