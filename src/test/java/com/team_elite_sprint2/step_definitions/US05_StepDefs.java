package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.pages.BasePage;
import com.team_elite_sprint2.pages.LoginPage;
import com.team_elite_sprint2.pages.US05_DriverPage_Bilgehan;
import com.team_elite_sprint2.pages.US05_VehiclesModelPage_Bilgehan;
import com.team_elite_sprint2.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.*;

public class US05_StepDefs extends BasePage {

    US05_VehiclesModelPage_Bilgehan modelPage = new US05_VehiclesModelPage_Bilgehan();
    LoginPage loginPage = new LoginPage();
    US05_DriverPage_Bilgehan driverPage = new US05_DriverPage_Bilgehan();

    @Given("Store Manager is logged in as {string} and {string}")
    public void storeManagerIsLoggedInAsAnd(String username, String password) {
        loginPage.login("storemanager51", "UserUser123");
    }

    @And("user hovers on Fleet dropdown on dashboard and user selects Vehicles Model")
    public void userHoversOnFleetDropdownOnDashboardAndUserSelectsVehiclesModel() {
      navigateToModule("Fleet" ,"Vehicles Model");
        //BrowserUtils.sleep(5);
        BrowserUtils.sleep(5);

    }


    @Then("user sees the columns as below")
    public void user_sees_the_columns_as_below(List<String> expectedColumns) {

     List<String> actualColumns = new ArrayList<>();

        for (WebElement each : modelPage.columns) {
         if(!actualColumns.contains(each.getText()))
            actualColumns.add(each.getText());
        }
        actualColumns.removeIf(p-> p.isBlank());

        BrowserUtils.sleep(5);
        System.out.println("expectedColumns = " + expectedColumns);
        System.out.println(actualColumns);
       // Assert.assertTrue(expectedColumns.equals(actualColumns));

       Assert.assertEquals(expectedColumns , actualColumns);
    }


    @Given("Sales Manager is logged in as {string} and {string}")
    public void salesManagerIsLoggedInAsAnd(String username, String password) {
        loginPage.login("salesmanager101", "UserUser123");
    }
    @Given("driver is logged in as {string} and {string}")
    public void driver_is_logged_in_as_and(String username, String password) {
        loginPage.login("user1", "UserUser123");
    }
    @Then("user sees You do not have permission to perform this action.")
    public void user_sees_you_do_not_have_permission_to_perform_this_action() {
        Assert.assertTrue(driverPage.message.isDisplayed());
    }

}
