package HotelSearchTest;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Parameters {

	WebDriver driver = new ChromeDriver();
	String URL = "https://ae.almosafer.com/en";

	String[] EnglishCities = { "Dubai", "Riyadh", "Jeddah" };
	String[] ArabicCities = { "دبي", "جدة" };

	Random rand = new Random();
	int Englishcitiesrandom = rand.nextInt(EnglishCities.length);
	int Arabiccetiesrandom = rand.nextInt(ArabicCities.length);

	int Randomvisitor = rand.nextInt(2);

	Assertion Myassert = new Assertion();

}