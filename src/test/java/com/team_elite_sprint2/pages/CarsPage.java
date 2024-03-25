package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CarsPage  extends  BasePage{

    public CarsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//table/tbody/tr[4]//a[@class='dropdown-toggle']")
    public WebElement threeDots;

    @FindBy(xpath = "//table/tbody/tr[2]//a[@class='dropdown-toggle']")
    public WebElement threeDots2;

    @FindBy(xpath = "//table/tbody/tr[3]//a[@class='dropdown-toggle']")
    public WebElement threeDots3;

    @FindBy(xpath = "//table/tbody/tr[5]//a[@class='dropdown-toggle']")
    public WebElement threeDots4;



    @FindBy(xpath = "//table/tbody/tr[4]//ul[@class='nav nav-pills icons-holder launchers-list']//a")
    public List<WebElement> infoIcons;

    @FindBy(xpath = "(//table/tbody/tr[4]//ul[@class='nav nav-pills icons-holder launchers-list']//a)[1]")
    public WebElement singleIcon;


    @FindBy(css = "a.btn-primary.pull-right")
    public WebElement createCarButton;

    @FindBy(css = ".fa-cog.hide-text")
    public WebElement gearIcon;




}
