package com.ebay.pageparts;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.eaby.infy.baseutils.Basesuite;
import com.eaby.infy.excelutils.ExcelUtil;

public class ShopingJewelryandwatches {

	
	private static Logger logger = Logger.getLogger("ShopingShoes");
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'https://www.ebay.com/b/Mens-Jewelry')]")	 
	private WebElement Mensjewelry;
	
	@FindBy(how = How.ID, using = "gh-ac")	 
	private WebElement SearchBox;
	
	@FindBy(how = How.ID, using = "gh-btn")	 
	private WebElement SearchBoxbutton;
	
	@FindBy(how = How.XPATH, using = "//div[h3[text()='Price']]/following-sbiling::ul/li[1]/div/a")	 
	private WebElement SelectUnderPrice;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='srp-results srp-list clearfix']/li[1]/div/div[2]/a")	 
	private WebElement SelectDynamicRings;
		
	
	@FindBy(how = How.XPATH, using = "//span[text()='Add to watch list']")	 
	private WebElement AddtoWatchList;
	
	@FindBy(how = How.ID, using = "gh-logo")	 
	private WebElement HomePage;
	
	public void selectsomeSpecificRings() throws Exception{
		logger.info("Selecting Men's Rings");
		Mensjewelry.click();
		logger.info("Searching for Rings");
		/*Reading the Data From the Excel Sheet*/
		SearchBox.sendKeys(ExcelUtil.getCellData(1,3));
		Basesuite.javaScriptClick(SearchBoxbutton);
		Basesuite.javaScriptClick(SelectDynamicRings);
		Basesuite.javaScriptClick(HomePage);
		
	}
	
}
