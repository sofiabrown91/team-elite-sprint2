package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.pages.CampaignsPageUS15;
import com.team_elite_sprint2.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US15_StepDefs {
    CampaignsPageUS15 campaignsPageUS15 = new CampaignsPageUS15();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));


    @When("user sees and clicks Manage filters button")
    public void user_sees_and_clicks_manage_filters_button() {
        campaignsPageUS15.filterButton.click();
        campaignsPageUS15.manageFiltersButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(campaignsPageUS15.manageFiltersOptions.get(4)));


    }
    @Then("users verifies {int} options are checked by default")
    public void user_verifies_options_are_checked_by_default(Integer checkedOptionNumber) {
        int count = 0;
        for (WebElement eachOption : campaignsPageUS15.manageFiltersOptions) {
            if (eachOption.isSelected()){
                count++;
            }
        }
        Assert.assertEquals((int) checkedOptionNumber,count);
    }


    @When("user uncheck {int} {int} {int} option")
    public void user_uncheck_or_more_options(Integer optionToUncheck1, Integer optionToUncheck2, Integer optionToUncheck3) {
        for (int i = 0; i < campaignsPageUS15.manageFiltersOptions.size(); i++) {
            if (i == optionToUncheck1 || i == optionToUncheck2 || i == optionToUncheck3){
                campaignsPageUS15.manageFiltersOptions.get(i).click();
            }
        }
    }
    @Then("user verifies {int} {int} {int} options are unchecked")
    public void user_verifies_or_more_options_are_unchecked(Integer optionToUncheck1, Integer optionToUncheck2, Integer optionToUncheck3) {
        String str1 = ""+ optionToUncheck1+optionToUncheck2+optionToUncheck3;
        String str2 = "";


            for (int i = 0; i < campaignsPageUS15.manageFiltersOptions.size(); i++) {
                if (i == optionToUncheck1 || i == optionToUncheck2 || i == optionToUncheck3 && !campaignsPageUS15.manageFiltersOptions.get(i).isSelected()){
                    wait.until(ExpectedConditions.elementToBeClickable(campaignsPageUS15.manageFiltersOptions.get(i)));
                    str2 += i;
                }
            }



        Assert.assertEquals(str1,str2);

    }



}
