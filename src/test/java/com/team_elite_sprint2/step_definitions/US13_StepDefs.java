package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.pages.AllVehicleCostPage;
import com.team_elite_sprint2.utilities.BrowserUtils;
import com.team_elite_sprint2.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US13_StepDefs {
    AllVehicleCostPage allVehicleCostPage = new AllVehicleCostPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));

    @Then("user should see columns")
    public void user_should_see_columns(List<String> expectedRows) {


      wait.until(ExpectedConditions.visibilityOf(allVehicleCostPage.h1AllVehicleCost));
      BrowserUtils.sleep(5);
        List<String> actualRow = BrowserUtils.getElementsText(allVehicleCostPage.filterRows);
       actualRow.removeIf(p->p.isBlank());
        System.out.println(actualRow);
        Assert.assertEquals(expectedRows, actualRow);
    }


    @When("user hover over on Fleet and clicks Vehicle Costs")
    public void user_hover_over_on_fleet_and_clicks_vehicle_coast() {
       allVehicleCostPage.waitUntilLoaderScreenDisappear();
       BrowserUtils.sleep(3);
        allVehicleCostPage.navigateToModule("Fleet", "Vehicle Costs");
    }

    @Then("user can click on first checkbox to select All Vehicle Costs")
    public void user_can_click_on_first_checkbox_to_select_all_vehicle_costs() {

        allVehicleCostPage.selectAllCheckbox.click();
        for (WebElement eachCheckbox : allVehicleCostPage.allCheckboxes) {
            Assert.assertTrue(eachCheckbox.isSelected());
        }


    }


}
