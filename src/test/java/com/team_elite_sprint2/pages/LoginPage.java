package com.team_elite_sprint2.pages;


import com.team_elite_sprint2.utilities.ConfigurationReader;
import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

    //Overload login Method: login with correct credential as a different type of user
    public void login(String userType) {//accept: driver, store manager, sales manager

        //based on input enter that user information
        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("driver")) {
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        } else if (userType.equalsIgnoreCase("sales manager")) {
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        } else if (userType.equalsIgnoreCase("store manager")) {
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }
        //send username and password and login
        login(username, password);
    }


}
