package com.team_elite_sprint2.step_definitions;


import com.team_elite_sprint2.pages.PinbarPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US03_StepDefs {

    PinbarPage pinbarPage = new PinbarPage();

    @Then("user clicks on pinbarLink")
    public void user_clicks_on_pinbar_link(){

    pinbarPage.pinbarLink.click();


    }


    @Then("user will see pinbar instructions header {string}")
    public void user_will_see_pinbar_instructions_header(String expectedHeader) {

        //pinbarPage.howToUsePinbarHeader.isDisplayed();
        Assert.assertEquals(pinbarPage.howToUsePinbarHeader.getText(), expectedHeader);

    }

    @Then("user will see pinbar instructions text as expected")
    public void user_will_see_pinbar_instructions_text_as_expected() {

    //pinbarPage.pinbarInstructions.isDisplayed();
    String expectedText = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
    String actualText = pinbarPage.pinbarInstructions.getText().trim();

    Assert.assertEquals(expectedText, actualText);

    }

    @Then("user will see example image")
    public void user_will_see_example_image() {

        //pinbarPage.exampleImage.isDisplayed();
        String expectedSource = "/bundles/oronavigation/images/pinbar-location.jpg";
        String actualSource = pinbarPage.exampleImage.getAttribute("src");

        Assert.assertTrue(actualSource.contains(expectedSource));

    }

}
