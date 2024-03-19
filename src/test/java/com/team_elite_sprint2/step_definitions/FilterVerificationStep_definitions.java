package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.pages.AccountsPage;
import com.team_elite_sprint2.pages.BasePage;
import com.team_elite_sprint2.utilities.BrowserUtils;
import com.team_elite_sprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FilterVerificationStep_definitions {
    AccountsPage accountsPage = new AccountsPage();

    @When("user hover over on Customers and clicks Accounts")
    public void user_hover_over_on_customers_and_clicks_accounts() {
        accountsPage.navigateToModule("Customers", "Accounts");

    }
    @Then("user should see filter names in filters section")
    public void user_should_see_filter_names_in_filters_section(List<String> expectedFilters) {
    accountsPage.filterButton.click();
    List<String> actualFilters = BrowserUtils.getElementsText(accountsPage.listOfFilters);
    List<String> actualFixedFilters = new ArrayList<>();

        for (String each : actualFilters) {
            String temp = each.substring(0,each.indexOf(":"));
            actualFixedFilters.add(temp);
        }

       Assert.assertEquals(expectedFilters,actualFixedFilters);
    }

}
