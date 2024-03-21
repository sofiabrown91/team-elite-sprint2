package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.pages.BasePage;
import com.team_elite_sprint2.pages.CreateCalendarEventPage;
import com.team_elite_sprint2.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US09_StepDefs {

    CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();
    @When("User enables the Repeat checkbox")
    public void user_enables_the_repeat_checkbox() {
        BrowserUtils.waitForClickablility(createCalendarEventPage.repeatCheckbox, 30);
        createCalendarEventPage.repeatCheckbox.click();
    }
    @And("User enters less than one {string} in the Repeat Every input field")
    public void userEntersLessThanOneInTheRepeatEveryInputField(String lessThan1) {
        createCalendarEventPage.repeatEveryInputField.sendKeys(Keys.BACK_SPACE);
        createCalendarEventPage.repeatEveryInputField.sendKeys(lessThan1 + Keys.ENTER);
    }
    @When("User enters more than ninety-nine {string} in the Repeat Every input field")
    public void userEntersMoreThanNinetyNineInTheRepeatEveryInputField(String moreThan99) {
        createCalendarEventPage.repeatEveryInputField.sendKeys(Keys.BACK_SPACE);
        createCalendarEventPage.repeatEveryInputField.sendKeys(moreThan99 + Keys.ENTER);
    }

    @Then("User should see the error message {string}")
    public void user_should_see_the_error_message(String expectedErrorMessage) {
        createCalendarEventPage.waitUntilLoaderScreenDisappear();
        Assert.assertEquals(expectedErrorMessage, createCalendarEventPage.errorMsg.getText());
    }
}
