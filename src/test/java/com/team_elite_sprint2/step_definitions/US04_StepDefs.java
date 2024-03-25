package com.team_elite_sprint2.step_definitions;


import com.team_elite_sprint2.pages.VehicleContractsPage;


import com.team_elite_sprint2.pages.VehicleContractsPage;
import com.team_elite_sprint2.pages.BasePage;
import com.team_elite_sprint2.pages.VehicleContractsPage;
import com.team_elite_sprint2.utilities.BrowserUtils;
import com.team_elite_sprint2.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class US04_StepDefs {

    VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();

public class US04_StepDefs extends BasePage {

    VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();


    @When("user hover over on Fleet and clicks Vehicle Contracts")
    public void userHoverOverOnFleetAndClicksVehicleContracts() {

        vehicleContractsPage.navigateToModule("Fleet","Vehicle Contracts");
    }



    @Then("user sees {string} title")
    public void userSeesTitle(String expectedTitle) {

        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(60));
            wait.until(ExpectedConditions.titleContains("All - Vehicle Contract - Entities"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        String actualTitle=Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(expectedTitle,actualTitle);
    }



    @Then("user sees {string} message on screen")
    public void user_sees_message_on_screen(String expectedMessage) {

        String actualMessage = vehicleContractsPage.accessDeniedMsg.getText();
        System.out.println("actualMessage = " + actualMessage);

        Assert.assertEquals(expectedMessage,actualMessage);


    }

}
