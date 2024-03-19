package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.pages.BasePage;
import com.team_elite_sprint2.pages.DashboardPage;
import com.team_elite_sprint2.utilities.BrowserUtils;
import com.team_elite_sprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US01_StepDefs extends BasePage {
    DashboardPage dashboardPage = new DashboardPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa1.vytrack.com/user/login");
    }

    @When("User navigates to question mark button and clicks on it")
    public void user_navigates_to_question_mark_button_and_clicks_on_it() {
        waitUntilLoaderScreenDisappear();
        dashboardPage.helpBtn.click();
    }
    @Then("User should see the oroinc documentation page open in a new tab")
    public void user_should_see_the_oroinc_documentation_page_open_in_a_new_tab() {
        BrowserUtils.switchWindowAndVerify("oroinc", "Oro Documentation");
    }
}
