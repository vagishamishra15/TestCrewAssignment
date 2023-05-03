package example.example.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;
import example.example.pages.SubscriptionPage;

public class SubscriptionPageTest extends BaseTest {
	
	
	@Test(priority = 1, testName = "validatePlanType", description = "Verify Plan Type on country basis")
	@Parameters ({"country", "planType"})
	 	public void validatePlanType(String country, String planType) {
	 		driver.get("https://subscribe.stctv.com/"+country);
	 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 		
	 		SubscriptionPage subscriptionPage = PageinstancesFactory.getInstance(SubscriptionPage.class);
	 		if("LITE".equals(planType)) {
	 			Assert.assertEquals( "LITE", subscriptionPage.liteType.getText(),"Verify Plan Type Lite");
	 		}
	 		else if("CLASSIC".equals(planType)) {
	 			
	 			Assert.assertEquals( "CLASSIC", subscriptionPage.classicType.getText(),"Verify Plan Type Classic");
	 		}
	 		else if("PREMIUM".equals(planType)) {
	 			Assert.assertEquals( "PREMIUM", subscriptionPage.PremiumType.getText(),"Verify Plan Type Premium");
	 		}
	 		
	 		
	}
	
	@Test(priority = 2, testName = "validatePlanPrice", description = "Verify Price for Plan Type on country basis")
	@Parameters ({"country", "planType", "price"})
	 	public void validatePlanPrice(String country, String planType, String price) {
			SubscriptionPage subscriptionPage = PageinstancesFactory.getInstance(SubscriptionPage.class);
	 		if("LITE".equals(planType)) {
	 			Assert.assertEquals( price, subscriptionPage.priceOfLite.getText(),"Verify Price for Plan Type Lite");
	 		}
	 		else if("CLASSIC".equals(planType)) {
	 			
	 			Assert.assertEquals( price, subscriptionPage.priceOfClassic.getText(),"Verify Price for Plan Type Classic");
	 		}
	 		else if("PREMIUM".equals(planType)) {
	 			Assert.assertEquals( price, subscriptionPage.priceOfPremium.getText(),"Verify Price for Plan Type Premium");
	 		}
	}
	
	@Test(priority = 3, testName = "validateCurrencyOfCountry", description = "Verify Currency of a Country")
	@Parameters ({"country", "planType", "price", "currency"})
	 	public void validateCurrencyOfCountry(String country, String planType, String price, String currency) {
			SubscriptionPage subscriptionPage = PageinstancesFactory.getInstance(SubscriptionPage.class);
	 		Assert.assertEquals( currency, subscriptionPage.currencyOfCountry.getText(),"Verify Currency of a Country");
	 		
	}
	
}
