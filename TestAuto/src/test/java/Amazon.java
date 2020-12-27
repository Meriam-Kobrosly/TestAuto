import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {
	WebDriver driver ;
	@Before
	public void inittest() { 
	String Path = "C:\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", Path);
	driver = new ChromeDriver();
	
	driver.get("https://www.amazon.fr/");
	
	
	}
	
	@Test 
	public void newAmazonTitleValid() {
    String actuelresult = driver.getTitle();
    String expectedresult = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
    org.junit.Assert.assertNotEquals(expectedresult,actuelresult);


	
	
}
}