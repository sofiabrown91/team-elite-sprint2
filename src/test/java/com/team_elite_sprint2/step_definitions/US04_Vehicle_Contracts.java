package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.pages.US04_Vehicle_Contracts_page;
import com.team_elite_sprint2.utilities.BrowserUtils;
import com.team_elite_sprint2.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;



import java.time.Duration;

public class US04_Vehicle_Contracts {

    US04_Vehicle_Contracts_page vehicleContractsPage = new US04_Vehicle_Contracts_page();

    @When("user chooses FLEET menu option on the Fleet Management page")
    public void userChoosesFLEETMenuOptionOnTheFleetManagementPage() {

        //vehicleContractsPage.navigateToModule("Fleet","Vehicle Contracts");

        String tab="Fleet";
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";

        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }

    }


    @Then("user clicks on Vehicle Contracts from dropdown menu")
    public void user_clicks_on_vehicle_contracts_from_dropdown_menu() {
        String module = "Vehicle Contracts";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)),  5);
        }



    }
    @Then("user sees All - Vehicle Contract - Entities - System - Car - Entities - System title")
    public void user_sees_all_vehicle_contract_entities_system_car_entities_system_title() {




        try {
       WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(60));
        wait.until(ExpectedConditions.titleContains("All - Vehicle Contract - Entities"));
        } catch (Exception e) {
            e.printStackTrace();
        }


        String expectedTitle="All - Vehicle Contract - Entities - System - Car - Entities - System";
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);

        Assert.assertEquals(expectedTitle,actualTitle);


    }

    @Then("user sees {string} message on screen")
    public void user_sees_message_on_screen(String string) {
        String expectedMessage = "You do not have permission to perform this action.";
        String actualMessage = vehicleContractsPage.accessDeniedMsg.getText();
        System.out.println("actualMessage = " + actualMessage);

        Assert.assertEquals(expectedMessage,actualMessage);



    }



}
