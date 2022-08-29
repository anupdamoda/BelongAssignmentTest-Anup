package autoapp.automation.stepDef;

import autoapp.automation.pages.BasePage;
import autoapp.automation.pages.PersonalInfoPage;
import autoapp.automation.pages.RegisterPage;
import autoapp.automation.pages.SummerDressesPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MegaMenuStepDef {

    @When("^I hover on Dresses Megamenu$")
    public void i_hover_on_dresses_megamenu() throws Throwable {
        BasePage.hover_dresses_megamenu();
    }

    @And("^I click on Summer Dresses menu$")
    public void i_click_on_summer_dresses_menu() throws Throwable {
        BasePage.click_sumrdress_menu();
    }

    @Then("^I should be land on \"([^\"]*)\" Page$")
    public void i_should_be_land_on_summer_dresses_page(String dresscategory) throws Throwable {
        SummerDressesPage.verifySummerPage(dresscategory);
        Thread.sleep(5000);
    }

}
