package HomePage;

import javax.naming.directory.Attributes;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePagetestcases extends Parameters {

	
	
	@BeforeTest 
	public void MySetup () {
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	
	@Test 
	public void CheckTheDefaultLanguageisEnglish () {
	 
		String ActualLanguage = driver.findElement(By.tagName("html")).getAttribute("lang");
		Myassert.assertEquals(ActualLanguage, ExpectedLanguage);
			
	}
	
	@Test 
	public void CheckTheDefaultCurruncy () {
		
		String ActualCurrency = driver.findElement(By.xpath("//button[@data-testid='Header__CurrencySelector']")).getText();
		Myassert.assertEquals(ActualCurrency, ActualCurrency); 
	}
	
	
	@Test 
	public void CheckTheDefaultNumber () {
		
		String actualnumber = driver.findElement(By.tagName("strong")).getText();
		Myassert.assertEquals(actualnumber, expectednumber);	
	}
	

}
