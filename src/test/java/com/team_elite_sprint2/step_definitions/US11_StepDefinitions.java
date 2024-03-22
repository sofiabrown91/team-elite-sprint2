package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.pages.BasePage;
import com.team_elite_sprint2.pages.CarOdometerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US11_StepDefinitions extends BasePage {

    CarOdometerPage carOdometerPage = new CarOdometerPage();


    @When("User hover their mouse over Fleet Tab and clicks on the Vehicle Odometer module")
    public void userHoverTheirMouseOverFleetTabAndClicksOnTheVehicleOdometerModule() {
        waitUntilLoaderScreenDisappear();
        navigateToModule("Fleet", "Vehicle Odometer");
    }


    @Then("User should see the error message {string} on the screen")
    public void userShouldSeeTheErrorMessageOnTheScreen(String expectedErrorMessage ) {
        String actualErrorMessage = errorMessage.getText();

        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);

    }

    @Then("User should see the default page as {int}")
    public void userShouldSeeTheDefaultPageAs(int expectedPageNumber) {
        waitUntilLoaderScreenDisappear();

        int actualPageNumber = Integer.parseInt(carOdometerPage.defaultPage.getAttribute("value"));

        Assert.assertEquals(expectedPageNumber, actualPageNumber);
    }

    @Then("User should see the View Per Page as {int} by default")
    public void userShouldSeeTheViewPerPageAsByDefault(int expectedPerPageNumber) {
        waitUntilLoaderScreenDisappear();

        int actualPerPageNumber = Integer.parseInt(carOdometerPage.viewPerPage.getText());
        Assert.assertEquals(expectedPerPageNumber, actualPerPageNumber);
    }
}
