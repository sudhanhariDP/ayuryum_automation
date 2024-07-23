package userpage;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import userbase.UserBase;

public class UserPage extends UserBase {
	
	//	RemoteWebDriver driver= null;
	
	public UserPage(RemoteWebDriver driver) {
		this.driver= driver;
	}
	
	public HeaderTest HeaderClass() {
		return new HeaderTest(driver);
	}
	
	public HomePage HomeNavPage() {
		driver.findElement(By.linkText("Home")).click();
		return new HomePage(driver);
	}
	
	public MenuPage MenuNavPage() {
		driver.findElement(By.linkText("Menu")).click();
		return new MenuPage(driver);
	}
	
	public OurPlanPage OurplanNavPage() {
		driver.findElement(By.linkText("Our Plan")).click();
		return new OurPlanPage(driver);
	}
	
	public HowItWorksPage HowItWorksNavPage() {
		driver.findElement(By.linkText("How it works")).click();
		return new HowItWorksPage(driver);
	}
	
	public FooterPage Footer() {
		return new FooterPage(driver);
	}
	
}

		
	


	


