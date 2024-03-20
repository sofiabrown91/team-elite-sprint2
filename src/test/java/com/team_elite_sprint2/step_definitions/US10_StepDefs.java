package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.pages.BasePage;
import com.team_elite_sprint2.pages.CalendarEventsPage;
import com.team_elite_sprint2.pages.CreateCalendarEventPage;
import com.team_elite_sprint2.utilities.BrowserUtils;
import com.team_elite_sprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US10_StepDefs extends BasePage {

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
    CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();

    @When("User navigates to Activities")
    public void user_navigates_to_activities() {
        waitUntilLoaderScreenDisappear();
        for (WebElement eachOption : menuOptions) {
            if(eachOption.getText().contains("Activities")){
                eachOption.click();
                break;
            }
        }
    }
    @And("User selects the Calendar Events")
    public void user_selects_the_calendar_events() {
        BrowserUtils.waitForClickablility(calendarEventsLink, 20);
        calendarEventsLink.click();
    }

    @And("User clicks on the Create Calendar Event button")
    public void user_clicks_on_the_create_calendar_event_button() {
        BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEventBtn, 20);
        calendarEventsPage.createCalendarEventBtn.click();
    }

    @And("User types {string} into the Description input box")
    public void userTypesIntoTheDescriptionInputBox(String text) {
        Driver.getDriver().switchTo().frame(createCalendarEventPage.descriptionIframe);
        createCalendarEventPage.descriptionInputField.sendKeys(text);
    }

    @Then("User should be able to type into the Description input box and see typed {string} text")
    public void userShouldBeAbleToTypeIntoTheDescriptionInputBoxAndSeeTypedText(String expectedText) {
        Assert.assertEquals(expectedText, createCalendarEventPage.descriptionInputField.getText());
    }
}
