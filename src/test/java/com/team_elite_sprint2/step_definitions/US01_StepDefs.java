package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US01_StepDefs {

    // This snippet is take care of users sales manager and store manager verifications of menu option's visibility.

    @Then("the user should see the following options")
    public void the_user_should_see_the_following_options(List<String> expectedTopModules) {

        LoginStepDefs dashboardPage = new LoginStepDefs();


        BrowserUtils.waitForTitleContains("Dashboard");

        List<String> actualTopModules = new ArrayList<>();

        for (WebElement eachTopModule : dashboardPage.menuOptions) {
            actualTopModules.add(eachTopModule.getText());

        }

        Assert.assertEquals(expectedTopModules, actualTopModules);

    }

// This snippet is take care of verification of driver users menu option's visibility.

    @Then("user should see the following options")
    public void user_should_see_the_following_options(List<String> expectedTopModules) {


        LoginStepDefs dashboardPage = new LoginStepDefs();


        BrowserUtils.waitFor(10);

        List<String> actualTopModules = new ArrayList<>();

        for (WebElement eachTopModule : dashboardPage.menuOptions) {
            actualTopModules.add(eachTopModule.getText());

        }

        Assert.assertEquals(actualTopModules, expectedTopModules);


    }



}
