package autoapp.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static autoapp.automation.utility.BrowserDriver.driver;
import static org.junit.Assert.assertEquals;

public class SummerDressesPage {

    public static String sumr_category_name_xpath = ".//div[@class='cat_desc']/span";
    public static String img_summerdress_xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img";
    public static String quickview_xpath = "//*[@id=\"center_column\"]//span[text()='Quick view']";
    public static String blue_xpath = "//*[@id=\"color_to_pick_list\"]/li/a[@title='Blue']";
    public static String add_to_cart_xpath ="//*[@id=\"add_to_cart\"]/button/span";
    public static String proceed_to_checkout ="//a[@title='Proceed to checkout']/span";
    public static String quantity_plus = "//*[@id=\"quantity_wanted_p\"]/a[2]/span";
    public static void verifySummerPage(String dresscategory){
        String actualCatName = driver.findElement(By.xpath(sumr_category_name_xpath)).getText();
        assertEquals (dresscategory,actualCatName);
    }

    public static void hoverSummerDress(){
        WebElement ele = driver.findElement(By.xpath(img_summerdress_xpath));
        //Creating object of an Actions class
        Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(ele).perform();
    }

    public static void clickQuickView(){
        driver.findElement(By.xpath(quickview_xpath)).click();
    }
    public static void switchFrame(){
        driver.switchTo().frame(0);
    }

    public static void clickBlueColor() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath(blue_xpath)).click();
    }
    public static void selectQuantity(int Quantity) throws InterruptedException {
        if (Quantity > 1){
            //Loop will enter here if the Quantity is more than 1
        for (int i =1;i < Quantity;i++){
            driver.findElement(By.xpath(quantity_plus)).click();
        }}
    }
    public static void selectSize(String size) throws InterruptedException {
        Select drpSize = new Select(driver.findElement(By.name("group_1")));
        drpSize.selectByVisibleText(size);
    }
    public static void addCart(){
        driver.findElement(By.xpath(add_to_cart_xpath)).click();
    }
    public static void proceedToCheckout() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.xpath(proceed_to_checkout)).click();
    }
}
