package com.ebay.testsuite;




import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.eaby.infy.baseutils.AppConstants;
import com.eaby.infy.baseutils.Basesuite;
import com.eaby.infy.excelutils.ExcelUtil;
import com.eaby.infy.loadproperties.LoadProperties;
import com.ebay.commonobjectrepo.EbayObject;


public class ebaytestsuite {
	public static EbayObject ebayobject;
	public Basesuite basesuite;
	
	
	@BeforeSuite
	public void beforesuite() throws Exception{
		basesuite=new Basesuite();
		/*WebDriverintialization*/
		basesuite.Webdriverintialization();
		/*Setting TestData in ExcelUtils*/
		ExcelUtil.setExcelFile(System.getProperty("user.dir")+LoadProperties.getdesiredProperty(AppConstants.Path_TestData) + LoadProperties.getdesiredProperty(AppConstants.File_TestData),"Shoes");
		ebayobject=new EbayObject();
		
	}
	
	@Test
	public void shoppingShoes() throws Exception{
		/*Shopping SHoes*/
		ebayobject.homepage.clickshoes();
		ebayobject.shopingshoes.selectaddidasShoes();
	}
	
	@Test
	public void shopping() throws Exception{
		/*Shopping Men's Rings*/
		ebayobject.homepage.jewelry_and_watches();
		ebayobject.shopingjewelryandwatches.selectsomeSpecificRings();
	}
	
	@AfterSuite
	public void aftersuite(){
		/*driver instance Kill*/
		basesuite.Webdriverintialization().quit();
	}
}
