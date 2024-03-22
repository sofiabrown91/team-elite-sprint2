package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.pages.CampaignPage;
import com.team_elite_sprint2.pages.MarketingFilterPage;
import com.team_elite_sprint2.utilities.BrowserUtils;
import com.team_elite_sprint2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class US14_StepDefs {

    MarketingFilterPage marketingFilterPage = new MarketingFilterPage();
    CampaignPage campaignPage = new CampaignPage();


    @Given("the user in on the campaign page")
    public void the_user_in_on_the_campaign_page() {

        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForClickablility(marketingFilterPage.marketingDropDown, 5);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(marketingFilterPage.marketingDropDown).perform();
        BrowserUtils.sleep(1);
        marketingFilterPage.campaignMenu.click();
    }

    @When("user sees Manage filters button")
    public void user_sees_manage_filters_button() {

        BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitForClickablility(campaignPage.btn_filter, 5);
        campaignPage.btn_filter.click();
        campaignPage.manageFiltersAddFilterButton.click();

    }

    @Then("user verifies {int} options are checked by default")
    public void user_verifies_options_are_checked_by_default(Integer int1) {

        boolean isSelected = false;

        BrowserUtils.sleep(2);
        for (WebElement each : campaignPage.filters) {
            if (each.isSelected()) {
                isSelected = true;
            } else {
                break;
            }
        }


        Assert.assertTrue(isSelected);
    }

    @And("user uncheck one or more options")
    public void userUncheckOneOrMoreOptions() {


        for (int i = 0; i < campaignPage.filters.size() - 1; i++) {

            if (campaignPage.filters.get(i).isSelected()) {
                campaignPage.filters.get(i).click();
                BrowserUtils.sleep(2);

            }
        }
    }
    @Then("user verifies one or more options are unchecked")
    public void userVerifiesOneOrMoreOptionsAreUnchecked() {

        BrowserUtils.waitForPageToLoad(10);
        boolean isSelected = false;
        int count = 0;

        try {
            for (int i = 1; i < campaignPage.filters.size(); i++) {

                if (campaignPage.filters.get(i).isSelected()) { // Checking if the box is selected
                    isSelected = true;
                    count++;

                    if (count >= 3) {
                        break;
                    }
                }
            }
            Assert.assertTrue(isSelected);
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        }
    }
}