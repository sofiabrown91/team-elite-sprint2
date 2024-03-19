package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountsPage extends BasePage {
    public AccountsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div.filter-criteria-selector")
    public List<WebElement> listOfFilters;

    @FindBy(css = "i.fa-filter.hide-text")
    public WebElement filterButton;




}
