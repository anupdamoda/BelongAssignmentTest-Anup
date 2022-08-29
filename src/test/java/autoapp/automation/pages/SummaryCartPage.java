package autoapp.automation.pages;

import cucumber.api.DataTable;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

import static autoapp.automation.utility.BrowserDriver.driver;
import static org.junit.Assert.assertEquals;

public class SummaryCartPage {

    public static String product_name = ".//*[@id=\"cart_summary\"]/tbody/tr/td[2]/p";
    public static String product_color_size = ".//*[@id=\"cart_summary\"]/tbody/tr/td[2]/small[2]";
    public static String product_quantity = ".//*[@id=\"cart_summary\"]/tbody/tr/td[5]/input[2]";

    public static void verify_product_name(){
        String actual_prod_name = driver.findElement(By.xpath(product_name)).getText();
        assertEquals("Printed Summer Dress",actual_prod_name);
    }
    public static void verify_product_color_size(DataTable dataTable){
        String actual_prod_color_size = driver.findElement(By.xpath(product_color_size)).getText();

        int iend =actual_prod_color_size.indexOf(",");

        String actual_prod_color = actual_prod_color_size.substring(0,iend);
        assertEquals("Color : Blue",actual_prod_color);

        List<Map<String,String>> quantityInfo = dataTable.asMaps(String.class,String.class);
        String exp_prod_size = quantityInfo.get(0).get("Size");

        String actual_prod_size = actual_prod_color_size.substring(actual_prod_color_size.lastIndexOf(", ") + 2);
        assertEquals(exp_prod_size,actual_prod_size);
    }
    public static void verify_product_quantity(DataTable dataTable){
        List<Map<String,String>> quantityInfo = dataTable.asMaps(String.class,String.class);
        String exp_prod_quantity = quantityInfo.get(0).get("Quantity");
        String actual_prod_quantity = driver.findElement(By.xpath(product_quantity)).getAttribute("value");
        assertEquals(exp_prod_quantity,actual_prod_quantity);
    }
}
