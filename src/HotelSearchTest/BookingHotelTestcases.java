package HotelSearchTest;

import java.time.Duration;
import java.util.List;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookingHotelTestcases extends Parameters {

	@BeforeTest
	public void Mysetup() {
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@Test(priority = 1)
	public void HotelSearchTab() {
		WebElement HotelTab = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		HotelTab.click();
		WebElement cetiessearchButton = driver.findElement(By.xpath("//input[@data-testid='AutoCompleteInput']"));

		if (driver.getCurrentUrl().contains("en")) {

			cetiessearchButton.sendKeys(EnglishCities[Englishcitiesrandom]);
			WebElement ResultList = driver.findElement(By.xpath("//ul[@data-testid='AutoCompleteResultsList']"));
			ResultList.findElements(By.tagName("li")).get(1).click();

		} else {
			cetiessearchButton.sendKeys(ArabicCities[Arabiccetiesrandom]);
			WebElement ResultList = driver.findElement(By.xpath("//ul[@data-testid='AutoCompleteResultsList']"));
			ResultList.findElements(By.tagName("li")).get(1).click();
		}
	}

	@Test(priority = 2)
	public void RandomlyVisitorSelected() {
		WebElement VisitorButton = driver
				.findElement(By.xpath("//select[@data-testid='HotelSearchBox__ReservationSelect_Select']"));

		Select selector = new Select(VisitorButton);
		selector.selectByIndex(Randomvisitor);

		WebElement SearchHottelButton = driver
				.findElement(By.xpath("//button[@data-testid='HotelSearchBox__SearchButton']"));

		SearchHottelButton.click();
	}

	@Test(priority = 3)
	public void ResultPage() throws InterruptedException {

		Thread.sleep(10000);
		WebElement resultfound = driver
				.findElement(By.xpath("//span[@data-testid='HotelSearchResult__resultsFoundCount']"));

		String resultfoundtext = resultfound.getText();

		Myassert.assertEquals(resultfoundtext.contains("found"), true);
	}

	@Test(priority = 4)

	public void SortingByLowestPrice() throws InterruptedException {

		Thread.sleep(2000);

		WebElement LowestPriceButton = driver
				.findElement(By.xpath("//button[@data-testid='HotelSearchResult__sort__LOWEST_PRICE']"));

		LowestPriceButton.click();
		Thread.sleep(5000);
		WebElement pageresult = driver.findElement(By.xpath("//div[@data-testid='HotelSearchResult__ResultsList']"));

		List<WebElement> Prices = pageresult.findElements(By.className("Price__Value"));

		int FirstPrice = Integer.parseInt(Prices.get(0).getText());
		int LastPrice = Integer.parseInt(Prices.get(Prices.size() - 1).getText());
		
		System.out.println(FirstPrice);
		System.out.println(LastPrice);
		Myassert.assertEquals(FirstPrice<LastPrice, true);
	}
}
