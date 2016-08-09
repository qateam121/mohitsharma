import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;





public class TC_0001 {

	
	public static void main(String args[]) throws Exception
	{
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		wd.get("http://www.gmail.com");
		wd.findElement(By.id("link-signup")).click();
		/*d.findElement(By.id("BirthMonth")).click();
		//we.sendKeys("August");*/

	WebElement droplist = wd.findElement(By.xpath("//*[@id='Gender']/div[1]"));
	droplist.sendKeys("Male");
	//Select ddlist = new Select(wd.findElement(By.id("BirthMonth")));
	System.out.println("amit");
	WebElement droplist1 = wd.findElement(By.xpath("//*[@id='BirthMonth']/div"));
	droplist1.sendKeys("May");
	}
	
}
