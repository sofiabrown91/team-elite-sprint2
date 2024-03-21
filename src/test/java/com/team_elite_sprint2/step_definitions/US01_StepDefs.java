package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.pages.DashboardMenuOptionsPage;
import com.team_elite_sprint2.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US01_StepDefs {


    DashboardMenuOptionsPage dashboardPage = new DashboardMenuOptionsPage();


    @Then("the user should see the following options") // Verification Top Modules options for Store Manager and Sales Manager users
    public void verifyMenuOptionsVisibility(List<String> expectedTopModules) {
        BrowserUtils.waitForTitleContains("Dashboard");
        verifyMenuOptions(expectedTopModules);

    }

    @Then("user should see the following options") // Verification Top Modules options for Driver user
    public void verifyMenuOptionsVisibilityForDriverUser(List<String> expectedTopModules) {
        BrowserUtils.waitFor(10);
        verifyMenuOptions(expectedTopModules);
    }

    public void verifyMenuOptions(List<String> expectedTopModules) {
        List<String> actualTopModules = BrowserUtils.getElementsText(dashboardPage.menuOptions);
        Assert.assertEquals(expectedTopModules, actualTopModules);
    }

    }

