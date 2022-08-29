package autoapp.automation.stepDef;

import autoapp.automation.pages.SummaryCartPage;
import autoapp.automation.pages.SummerDressesPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class CartSummaryPageStepDef {

    @When("^I should be able to validate the product name, blue color, quantity, size in Cart Summary Page$")
    public void i_should_be_able_to_validate_name_color_quantity(DataTable dataTable) throws Throwable {
        SummaryCartPage.verify_product_name();
        SummaryCartPage.verify_product_color_size(dataTable);
        SummaryCartPage.verify_product_quantity(dataTable);
    }
}
