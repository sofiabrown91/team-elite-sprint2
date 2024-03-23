package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.pages.BasePage;
import com.team_elite_sprint2.pages.CreateCalendarEventPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US08_StepDefs extends BasePage {
    CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();

//    @And("user hover over on {string} and clicks {string}")
//    public void user_hover_over_on_and_clicks(String tab, String module) {
//        navigateToModule(tab, module);
//
//    }
    @Then("User should see the number {string} by default in the Repeat Every input option")
    public void user_should_see_the_number_by_default_in_the_repeat_every_input_option(String expectedValue) {
        Assert.assertEquals(expectedValue, createCalendarEventPage.repeatEveryInputFieldValue.getAttribute("value"));
    }

    @And("User clears the Repeat Every field")
    public void user_clears_the_repeat_every_field() {
        createCalendarEventPage.repeatEveryInputField.sendKeys(Keys.BACK_SPACE);
        createCalendarEventPage.saveAndCloseBtn.click();
    }


}
