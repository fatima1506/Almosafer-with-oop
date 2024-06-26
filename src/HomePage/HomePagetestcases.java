package HomePage;

import java.time.Duration;
import java.time.LocalDate;

import javax.naming.directory.Attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePagetestcases extends Parameters {

	@BeforeTest
	public void MySetup() {
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	}

	@Test (enabled = false)
	public void CheckTheDefaultLanguageisEnglish() {

		String ActualLanguage = driver.findElement(By.tagName("html")).getAttribute("lang");
		Myassert.assertEquals(ActualLanguage, ExpectedEnglishLanguage);
	}

	@Test (enabled = false)
	public void CheckTheDefaultCurruncy() {

		String ActualCurrency = driver.findElement(By.xpath("//button[@data-testid='Header__CurrencySelector']"))
				.getText();
		Myassert.assertEquals(ActualCurrency, ActualCurrency);
	}

	@Test(enabled = false)
	public void CheckTheDefaultNumber() {

		String actualnumber = driver.findElement(By.tagName("strong")).getText();
		Myassert.assertEquals(actualnumber, expectednumber);
	}

	@Test (enabled = false)
	public void CheckTheBottonVisaAvailable () {
	
WebElement VisaButton = driver.findElement(By.cssSelector(".sc-bdVaJa.bNehGJ.visa-icon"));
   boolean ActuallVisabutton =VisaButton.isDisplayed();
Myassert.assertEquals(ActuallVisabutton, true);
	}
	
	@Test (enabled = false)
	public void  CheckTheBottonPayAvailable () {
		WebElement PayButton = driver.findElement(By.xpath("//img[@data-testid='Footer__ApplePayLogo']"));
	boolean ActualPaybottun =	PayButton.isDisplayed();
	Myassert.assertEquals(ActualPaybottun, true); 
			}		
	
	@Test (enabled = false)
	public void CheckTheHotelTapIsNotSelectedByDefault () {
		
	WebElement hotelbutton =driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		String Actualhoteltap =hotelbutton.getAttribute("aria-selected");
		
		Myassert.assertEquals(Actualhoteltap, "false" );	
	}
		@Test (enabled = false)
		public void FlightDeparture () {
			
	LocalDate Today = LocalDate.now();
	
	int Tomorrow = Today.plusDays(1).getDayOfMonth();

	
	String ActualDepartureDay = driver.findElement(By.cssSelector("div[class='sc-iHhHRJ sc-kqlzXE blwiEW'] span[class='sc-cPuPxo LiroG']")).getText();
	int ActualDepartureDayasanumber	=Integer.parseInt(ActualDepartureDay);		

	Myassert.assertEquals(ActualDepartureDayasanumber, Tomorrow);
		}
		
	@Test (enabled = false)
	public void FlightReturn () {
		LocalDate Today = LocalDate.now();
		
		int TheDayaftertomorrow = Today.plusDays(2).getDayOfMonth();
		String ActualReturneDay = driver.findElement(By.cssSelector("div[class='sc-iHhHRJ sc-OxbzP edzUwL'] span[class='sc-cPuPxo LiroG']")).getText();
		int ActualReturneDayasanumber =Integer.parseInt(ActualReturneDay);
		
		Myassert.assertEquals(ActualReturneDayasanumber, TheDayaftertomorrow);
			
		}
			
	@Test 
	public void randomlanguage ()  {
		  
	driver.get(websites[randomwebsite]);
	
	if (driver.getCurrentUrl().contains("en")) {
	String Actuallanguale = driver.findElement(By.tagName("html")).getAttribute("lang");
		Myassert.assertEquals(Actuallanguale, ExpectedEnglishLanguage);
	
	} else {
		String Actuallanguale = driver.findElement(By.tagName("html")).getAttribute("lang");
		Myassert.assertEquals(Actuallanguale, expectedArabiclanguage);
	
	}

	}	
	}
	
	
	
	
	
	
	
	
	
	



