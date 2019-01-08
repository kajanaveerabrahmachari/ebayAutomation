package com.ebay.pageparts;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.eaby.infy.baseutils.Basesuite;

public class Homepage {
	private static Logger logger = Logger.getLogger("Homepage");
	@FindBy(how = How.XPATH, using = "//h3[text()='Shoes']")	 
	private WebElement Shoes;
	
	@FindBy(how = How.XPATH, using = "//h3[text()='Jewelry & Watches']")	 
	private WebElement Jewelry_AND_Watches;
	
	@FindBy(how = How.XPATH, using = "//h3[text()='Beauty']")	 
	private WebElement Beauty;
	
	
	public void clickshoes(){
		logger.info("Clicking on Shoes ");
		/*Before click taking Screenshot*/
		Basesuite.captureScreenShot();
		/*using JavaScript Method to click on WebElment*/
		Basesuite.javaScriptClick(Shoes);
		Basesuite.implicitlyWait();
		/*After click taking Screenshot*/
		Basesuite.captureScreenShot();
	}
	
	public void jewelry_and_watches(){
		logger.info("Clicking on jewelry_and_watches ");
		/*Before click taking Screenshot*/
		Basesuite.captureScreenShot();
		/*using JavaScript Method to click on WebElment*/
		Basesuite.javaScriptClick(Jewelry_AND_Watches);
		Basesuite.implicitlyWait();
		/*After click taking Screenshot*/
		Basesuite.captureScreenShot();
	}
	
	public void clickonBeauty(){
		logger.info("Clicking on beauty items ");
		/*Before click taking Screenshot*/
		Basesuite.captureScreenShot();
		/*using JavaScript Method to click on WebElment*/
		Basesuite.javaScriptClick(Beauty);
		Basesuite.implicitlyWait();
		/*After click taking Screenshot*/
		Basesuite.captureScreenShot();
	}
	
	
	
	

}
