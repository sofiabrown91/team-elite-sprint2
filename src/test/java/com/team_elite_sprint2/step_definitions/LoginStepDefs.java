package com.team_elite_sprint2.step_definitions;

import com.team_elite_sprint2.pages.BasePage;
import com.team_elite_sprint2.pages.LoginPage;
import com.team_elite_sprint2.utilities.BrowserUtils;
import com.team_elite_sprint2.utilities.ConfigurationReader;
import com.team_elite_sprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LoginStepDefs extends BasePage{

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("driver")){
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        }else if(userType.equalsIgnoreCase("sales manager")){
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        }else if(userType.equalsIgnoreCase("store manager")){
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }



    @Then("the user should see the following options")
    public void the_user_should_see_the_following_options(List<String> expectedTopModules) {

        LoginStepDefs dashboardPage = new LoginStepDefs();


            BrowserUtils.waitForTitleContains("Dashboard");

            List<String> actualTopModules = new ArrayList<>();

            for (WebElement eachTopModule : dashboardPage.menuOptions) {
                actualTopModules.add(eachTopModule.getText());

            }

            Assert.assertEquals(expectedTopModules,actualTopModules);

        }


    @Then("user should see the following options")
    public void user_should_see_the_following_options(List<String> expectedTopModules){


        LoginStepDefs dashboardPage = new LoginStepDefs();


        BrowserUtils.waitFor(10);

        List<String> actualTopModules = new ArrayList<>();

        for (WebElement eachTopModule : dashboardPage.menuOptions) {
            actualTopModules.add(eachTopModule.getText());

        }

        Assert.assertEquals(actualTopModules,expectedTopModules);



    }

}



