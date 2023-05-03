package example.example.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SubscriptionPage extends BasePage{
	
	public SubscriptionPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "country-btn")
	@CacheLookup()
	private WebElement countryName;
	
	@FindBy(id= "name-lite")
	@CacheLookup()
	public WebElement liteType;
	
	@FindBy(id ="name-classic")
	@CacheLookup()
	public WebElement classicType;
	
	@FindBy(id ="name-premium")
	@CacheLookup()
	public WebElement PremiumType;
	
	@FindBy(xpath = "//div[@id='currency-lite'][1]/b[1]")
	@CacheLookup()
	public WebElement priceOfLite;
	
	@FindBy(xpath = "//div[@id='currency-classic'][1]/b[1]")
	@CacheLookup()
	public WebElement priceOfClassic;
	
	@FindBy(xpath = "//div[@id='currency-premium'][1]/b[1]")
	@CacheLookup()
	public WebElement priceOfPremium;
	
	@FindBy(xpath = "//div[@id='currency-premium'][1]/i[1]")
	@CacheLookup()
	public WebElement currencyOfCountry;
	
	
	
	
	
	
	
	
	public void selectCountry(String countryCode) {
		countryName.click();
		//List<WebElement> linksList = driver.findElements(By.className("country"));
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		for(WebElement link:linksList){
			 String linkText  = link.getText(); 
			if (link.getAttribute("href").contains(countryCode)){
				link.click();
			}
		}}
	
	

	
	
	
	
}
