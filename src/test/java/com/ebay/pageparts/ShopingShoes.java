package com.ebay.pageparts;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.eaby.infy.baseutils.Basesuite;
import com.eaby.infy.excelutils.ExcelUtil;

public class ShopingShoes {
	
	private static Logger logger = Logger.getLogger("ShopingShoes");
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'https://www.ebay.com/b/Mens-Shoes')]")	 
	private WebElement MenShoes;
	
	@FindBy(how = How.ID, using = "gh-ac")	 
	private WebElement SearchBox;
	
	@FindBy(how = How.ID, using = "gh-btn")	 
	private WebElement SearchBoxbutton;
	
	@FindBy(how = How.XPATH, using = "//div[@id='srp-river-results-query_answer1-w0-x-carousel-items']/ul/li[1]/div/a")	 
	private WebElement selectSize;
	
	
	@FindBy(how = How.XPATH, using = "//span[text()='New with box']")	 
	private WebElement newWithBox;
	
	@FindBy(how = How.XPATH, using = "//span[text()='adidas']")	 
	private WebElement adidas;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Add to watch list']")	 
	private WebElement AddtoWatchList;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='srp-results srp-grid clearfix']/li[1]/div/div[2]/a")	 
	private WebElement SelectDynamicShoes;
	
	@FindBy(how = How.ID, using = "gh-logo")	 
	private WebElement HomePage;
	
	
	
	public void selectaddidasShoes() throws Exception{
		logger.info("Selecting Men's Shoes");
		MenShoes.click();
		logger.info("Searching for Addidas Brand");
		/*Reading the Data From the Excel Sheet*/
		SearchBox.sendKeys(ExcelUtil.getCellData(1,2));
		Basesuite.javaScriptClick(SearchBoxbutton);
		logger.info("Selecting size");
		Basesuite.javaScriptClick(selectSize);
		logger.info("Selecting Brand shoes");
		Basesuite.javaScriptClick(SelectDynamicShoes);
		logger.info("Add to Watch List");
		Basesuite.javaScriptClick(AddtoWatchList);
		logger.info("Navigating to Home Page");
		Basesuite.javaScriptClick(HomePage);
	}
	

}
