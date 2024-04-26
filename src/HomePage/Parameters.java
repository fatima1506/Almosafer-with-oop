package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;

public class Parameters {
	
	
	WebDriver driver = new ChromeDriver(); 
	String URL = "https://ae.almosafer.com/en" ;
	
	

	 String ExpectedLanguage = "en";
	 String ExpectedCurrency ="SAR";
	 String expectednumber = "+966554400000";


	Assertion Myassert = new Assertion(); 

}
