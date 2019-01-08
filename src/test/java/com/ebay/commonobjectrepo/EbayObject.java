package com.ebay.commonobjectrepo;

import org.openqa.selenium.support.PageFactory;

import com.eaby.infy.baseutils.Basesuite;
import com.ebay.pageparts.Homepage;
import com.ebay.pageparts.ShopingJewelryandwatches;
import com.ebay.pageparts.ShopingShoes;
/**
 * All Page Objects are going to store in this Java Class File
 * @author kajve01
 *
 */
public class EbayObject {
	public Homepage homepage;
	public ShopingShoes shopingshoes;
	public ShopingJewelryandwatches shopingjewelryandwatches;
	
	
	public EbayObject(){
		homepage=PageFactory.initElements(Basesuite.driver, Homepage.class);
		shopingshoes=PageFactory.initElements(Basesuite.driver, ShopingShoes.class);
		shopingjewelryandwatches=PageFactory.initElements(Basesuite.driver, ShopingJewelryandwatches.class);
	}
	

}
