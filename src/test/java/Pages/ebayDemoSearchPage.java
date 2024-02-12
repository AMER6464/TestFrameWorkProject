package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Driver;

public class ebayDemoSearchPage {




	


public static WebElement[] items;

public ebayDemoSearchPage() {
	
	PageFactory.initElements(Driver.getDriver(), this);
	
	
}


 

@FindBy (id= "gh-ac")
 public WebElement SearchBoxItem;
 
 
 @FindBy (id = "gh-btn" )
 public WebElement SearchButton;
 
 @FindBy (css = ".inventory_item_price")
 public List<WebElement> itemPrices;

 
 
 

 
 
 
 
 
 





}
