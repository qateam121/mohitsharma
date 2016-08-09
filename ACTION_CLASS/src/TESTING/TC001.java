package TESTING;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC001 {
	
	@Test
	public void tcase1(){
		System.setProperty("webdriver.chrome.driver", "E:\\selenium_nitn\\software testing notes\\software\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("sfhdshf");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("shfdsfhdsj").perform();
		act.sendKeys(Keys.RETURN).perform();
		
	}

}
