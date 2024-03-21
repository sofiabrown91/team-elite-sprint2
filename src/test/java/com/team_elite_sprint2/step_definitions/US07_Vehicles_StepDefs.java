package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.pages.BasePage;
import com.team_elite_sprint2.pages.US07_VehiclesPage_Bilgehan;
import com.team_elite_sprint2.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US07_Vehicles_StepDefs extends BasePage {
    US07_VehiclesPage_Bilgehan vehiclePage = new US07_VehiclesPage_Bilgehan();

    @And("user hovers on Fleet dropdown on dashboard and user selects Vehicles")
    public void userHoversOnFleetDropdownOnDashboardAndUserSelectsVehicles() {
        navigateToModule("Fleet", "Vehicles");
    }

    @Then("user  sees all boxes unchecked")
    public void userSeesAllBoxesUnchecked() {
        for (WebElement eachcheckbox : vehiclePage.checkboxes) {
            Assert.assertTrue(!eachcheckbox.isSelected());
        }
        BrowserUtils.sleep(5);
    }

    @Given("user clicks the first check box")
    public void user_clicks_the_first_check_box() {
        BrowserUtils.sleep(5);
        vehiclePage.mainCheckbox.click();

    }

    @Then("all the cars are selected")
    public void all_the_cars_are_selected() {
        for (WebElement eachcheckbox : vehiclePage.checkboxes) {
            Assert.assertTrue(eachcheckbox.isSelected());
        }
    }

    @And("User clicks on {int}")
    public void userClicksOn(int checkboxIndex) {
        vehiclePage.selectCheckbox(checkboxIndex);
    }

    @Then("clicked car is selected")
    public void clicked_car_is_selected() {
        for (WebElement checkbox : vehiclePage.checkboxes) {
           if (checkbox.isSelected()){
               Assert.assertTrue(checkbox.isSelected());
               break;
           }
        }
    }


}
