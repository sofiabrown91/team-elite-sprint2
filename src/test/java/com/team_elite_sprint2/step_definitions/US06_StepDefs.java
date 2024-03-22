package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.pages.CarsPage;

import com.team_elite_sprint2.utilities.BrowserUtils;
import com.team_elite_sprint2.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US06_StepDefs {



    Actions actions = new Actions(Driver.getDriver());

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
    CarsPage carsPage = new CarsPage();


    @When("user hover over on {string} and clicks {string}")
    public void user_hover_over_on_and_clicks(String tab, String module) {

        carsPage.navigateToModule(tab,module);
        carsPage.waitUntilLoaderScreenDisappear();


    }
    @When("hover over on the three dots in the right side of the table")
    public void hover_over_on_the_three_dots_in_the_right_side_of_the_table() {

        carsPage.waitUntilLoaderScreenDisappear();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)", carsPage.threeDots );
        BrowserUtils.hover(carsPage.gearIcon);
        BrowserUtils.hover(carsPage.createCarButton);
        BrowserUtils.hover(carsPage.threeDots2);
        BrowserUtils.hover(carsPage.threeDots3);
        actions.moveToElement(carsPage.threeDots).doubleClick(carsPage.threeDots);
        BrowserUtils.hover(carsPage.threeDots4);
        BrowserUtils.hover(carsPage.threeDots);


    }
    @Then("user can see edit car info icons")
    public void user_can_see_edit_car_info_icons(List<String> expectedIcons) {
        List<String> actualIcons = new ArrayList<>();
       for (WebElement eachIcon : carsPage.infoIcons) {
           Assert.assertTrue(eachIcon.isDisplayed());
           actualIcons.add(eachIcon.getAttribute("title"));
        }
       //Assert.assertEquals(expectedIcons,actualIcons);
    }



}
