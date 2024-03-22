package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MarketingFilterPage extends BasePage{


    public MarketingFilterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(css = "span.title-level-1")
    public List<WebElement> mainModuleOptions;//Marketing,Sales,System...



    @FindBy(xpath = "(//span[@class='title title-level-1'])[6]")
    public WebElement marketingDropDown;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[15]")
    public WebElement campaignMenu;

}

