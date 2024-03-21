package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
        public DashboardPage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }
        @FindBy(xpath = "//a[@class='help no-hash']")
        public WebElement helpBtn;

}
