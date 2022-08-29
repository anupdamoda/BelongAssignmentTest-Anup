package autoapp.automation.stepDef;

import autoapp.automation.pages.BasePage;
import autoapp.automation.pages.SummaryCartPage;
import autoapp.automation.pages.SummerDressesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SummerPageStepDef {

    @When("^I click on Quick view of the Summer dress, select blue color, select quantity \"([^\"]*)\" & size \"([^\"]*)\"$")
    public void i_click_on_quickview_summerdress_bluecolor(int Quantity,String Size) throws Throwable {
        SummerDressesPage.hoverSummerDress();
        SummerDressesPage.clickQuickView();
        SummerDressesPage.switchFrame();
        SummerDressesPage.clickBlueColor();
        SummerDressesPage.selectQuantity(Quantity);
        SummerDressesPage.selectSize(Size);
    }

    @And("^I add item to the Cart$")
    public void i_add_item_to_the_cart() throws Throwable {
        SummerDressesPage.addCart();
    }
    @And("^I proceed to checkout$")
    public void i_proceed_to_checkout() throws Throwable {
        Thread.sleep(10000);
        SummerDressesPage.proceedToCheckout();
    }
}
