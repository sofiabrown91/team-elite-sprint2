package com.team_elite_sprint2.pages;

import com.team_elite_sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US07_VehiclesPage_Bilgehan {

    public US07_VehiclesPage_Bilgehan(){
        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy (xpath = "//input[@tabindex='-1']")
    public List<WebElement> checkboxes ;

    @FindBy (xpath = "(//button//input[@type='checkbox'])[1]")
    public WebElement mainCheckbox ;

    public void selectCheckbox(int index){
        for (int i = 0; i < checkboxes.size(); i++) {
            if (i==index) {
                checkboxes.get(i).click();
                break;
            }
        }
    }

}
