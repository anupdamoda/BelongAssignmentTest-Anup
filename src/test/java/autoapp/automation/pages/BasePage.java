package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import sun.rmi.runtime.Log;


import java.util.Random;

public class BasePage extends BrowserDriver{

	public static String dresses_megamenu_xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a[@title='Dresses']";
	public static String summerdress_megamenu_xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a[@title='Summer Dresses']";

	public BasePage(BrowserDriver driver){
		super(driver);
	}

	public static int generateRandomIntIntRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	public static void hover_dresses_megamenu(){
		WebElement ele = driver.findElement(By.xpath(dresses_megamenu_xpath));
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

	}
	public static void click_sumrdress_menu() throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath(summerdress_megamenu_xpath));
		//Creating object of an Actions class
		Actions action = new Actions(driver);
		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath(summerdress_megamenu_xpath)).click();
	}
}
