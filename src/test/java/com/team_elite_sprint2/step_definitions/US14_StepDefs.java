package com.team_elite_sprint2.step_definitions;
import com.team_elite_sprint2.pages.MarketingFilterPage;
import com.team_elite_sprint2.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class US14_StepDefs {

 MarketingFilterPage marketingFilterPage = new MarketingFilterPage();
 WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


 @When("user hover over on Marketing and clicks Campaigns")
 public void userHoverOverOnMarketingAndClicksCampaigns() {


 }

 @Then("user should see these options on columns")
 public void userShouldSeeTheseOptionsOnColumns() {


 }

 @When("user hover over on Marketing and clicks on Campaigns button")
 public void userHoverOverOnMarketingAndClicksOnCampaignsButton() {


 }

 @Then("user hover over on Manage filters dropdown and clicks on it")
 public void userHoverOverOnManageFiltersDropdownAndClicksOnIt() {


 }




 @Then("user can click on any amount of boxes and can uncheck.\\(Can check only {int} or multiple)")
 public void userCanClickOnAnyAmountOfBoxesAndCanUncheckCanCheckOnlyOrMultiple(int arg0) {




 }


}



