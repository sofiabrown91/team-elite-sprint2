package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarEventPage {

    public CreateCalendarEventPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@id='mceu_24']/iframe")
    public WebElement descriptionIframe;

    @FindBy (xpath = "//body[@id='tinymce']")
    public WebElement descriptionInputField;
}
