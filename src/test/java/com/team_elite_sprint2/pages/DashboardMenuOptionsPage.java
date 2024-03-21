package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardMenuOptionsPage extends BasePage{

    public DashboardMenuOptionsPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(css = "span.title-level-1")
    public List<WebElement> menuOptions;
}
