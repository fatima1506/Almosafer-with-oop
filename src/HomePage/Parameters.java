package HomePage;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v124.storage.model.RelatedWebsiteSet;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;

public class Parameters {
	
	
	WebDriver driver = new ChromeDriver(); 
	String URL = "https://ae.almosafer.com/en" ;
	
	

	 String ExpectedEnglishLanguage = "en";
	 String expectedArabiclanguage = "ar";
	 String ExpectedCurrency ="SAR";
	 String expectednumber = "+966554400000";


	Assertion Myassert = new Assertion(); 
	
   Random rand = new Random() ;
   String [] websites = {"https://ae.almosafer.com/en" ,"https://ae.almosafer.com/ar"};
 
   int randomwebsite = rand.nextInt(websites.length); 
	

}
