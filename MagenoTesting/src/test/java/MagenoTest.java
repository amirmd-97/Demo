import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagenoTest {

	@Test
	public void testcase()
	{
		String url ="https://www.magento.com";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Welcome w=new Welcome(driver);
		w.clickOnMyaccount();
		Login l = new Login(driver);
		l.enterEmail();
		l.enterpassword();
		l.clickOnLogin();
		Main m = new Main(driver);
		m.clickOnLogout();

	}

}
