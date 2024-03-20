package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarEventPage extends BasePage{

    public CreateCalendarEventPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@id='mceu_24']/iframe")
    public WebElement descriptionIframe;

    @FindBy (xpath = "//body[@id='tinymce']")
    public WebElement descriptionInputField;

    @FindBy (xpath = "//input[contains(@id, 'recurrence-repeat')]")
    public WebElement repeatCheckbox;

    @FindBy (xpath = "(//input[@class='recurrence-subview-control__number'])[1]")
    public WebElement repeatEveryInputField;

    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public WebElement saveAndCloseBtn;

    @FindBy (xpath = "(//span[@class='validation-failed'])[2] ")
    public WebElement errorMsg;





}
