package HomeTest;



import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import PomRepository.HomePage;
import PomRepository.LoginPage;

public class ToVerifyTheHomePage 
{
	  @Test
	  public void toVerifyTheHomePage
	  {
	
	   LoginPage login=new LoginPage(driver);
	   login.loginActionWithoutRemberingMe("admin","manager");
	   
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20);
	   wait.until(ExpectedConditions.titleContains("Enter"));
	   String actualHomePageTitle=driver.getTitle();
	   Assert.assertTrue(actualHomePageTitle.contains("Enter"));
	   
	   HomePage home=new HomePage(driver);
	   home.logoutAction();
	   
	   wait.until(ExpectedConditions.titleContains("Login"));
	   String.actualLoginPageTitle=driver.getTitle();
	   
	   Assert.assertTrue(actualLoginPageTitle.contains("Login"));
	   driver.quit();
   }
}

	   
	   
	
