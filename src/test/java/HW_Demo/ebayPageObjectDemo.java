package HW_Demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v119.page.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.ebayDemoSearchPage;
import Utils.BrowserUtils;
import Utils.DataReader;
import Utils.Driver;

import Utils.DataReader;

public class ebayPageObjectDemo {








	
	

	public static void main(String[] args)  throws InterruptedException{
		ebaySearchPageDemo();
		
		}


	public static void ebaySearchPageDemo() throws InterruptedException {
		
		
			
		
		
		String Item = "coffee mug";
		
		
		ebayDemoSearchPage EbayPage = new ebayDemoSearchPage();
		
		BrowserUtils utils = new BrowserUtils();
		
		// go to ebay website 
		Driver.getDriver().get(DataReader.getProperty("ebay_url"));
		
		
		utils.waitForElementToBeVisible(EbayPage.SearchBoxItem);
		
		
		EbayPage.SearchBoxItem.sendKeys(DataReader.getProperty("Item"));
		
		utils.waitForElementToBeVisible(EbayPage.SearchButton);
		EbayPage.SearchButton.click();
		Thread.sleep(2000);
		
	  
		utils.waitForAllElementsToBeVisible(EbayPage.itemPrices); 
		
		
		
		//public String price() {
				//String text ="";
				//for(WebElement price:itemPrices) {
					//text = price.getText();
				//}
				 
				 //return text;
			 
		
		
		
		
			
	        }
			
		
		
		}
		
	   
		

		
	
	


		





	
