package userpagetest;

import org.testng.annotations.Test;

import userbase.UserBase;
import userpage.FooterPage;
import userpage.HeaderTest;
import userpage.HomePage;
import userpage.HowItWorksPage;
import userpage.MenuPage;
import userpage.OurPlanPage;
import userpage.UserPage;

public class UserPageTest extends UserBase {	
	
	@Test(priority=1)
	public void TestCase() {
		
		new UserPage(driver)
		.HomeNavPage();
		
		new HomePage(driver)
		.VideoPlayback();	
		
	}
	
	@Test(priority=2)
	public void TestCase2() {
		
		new UserPage(driver)
		.MenuNavPage();
		
		new MenuPage(driver)
		.selectDate();	
		
	}
	
	@Test(priority=3)
	public void TestCase3() {
		
		new UserPage(driver)
		.OurplanNavPage();
		
		new OurPlanPage(driver)
		.SelectOptions();
		
	}
	
	@Test(priority=4)
	public void TestCase4() {
		
		new UserPage(driver)
		.HowItWorksNavPage();
		
		new HowItWorksPage(driver)
		.HowItWorks();		
		
	}
	
	@Test(priority=5)
	public void TestCase5() {
		
		new UserPage(driver)
		.Footer();

		new FooterPage(driver)
		.Footers();
		
	}
	
	@Test(priority=6)
	public void TestCase6() {
		
		new UserPage(driver)
		.HeaderClass();
		
		new HeaderTest(driver)
		.Header();
		
		
		
//		@Test(priority = 1)
//		public void TestCase() {
//			
////			new UserPage(driver)
////			.HomeNavPage();
////			
////			new UserPage(driver)
////			.MenuNavPage();
//			
//			new UserPage(driver)
//			.OurplanNavPage();
//			
////			new UserPage(driver)
////			.HowItWorksNavPage();
	////
////			
////			new HomePage(driver)
////			.VideoPlayback();
////			
////			new MenuPage(driver)
////			.selectDate();
//			
//			new OurPlanPage(driver)
//			.SelectOptions();
//			
////			new HowItWorksPage(driver)
////			.HowItWorks();
	//
//			
//		}
	//
	//
//		@Test(priority = 2)
//		public void TestCase2() {
//			
////			new UserPage(driver)
////			.HomeNavPage();
////			
////			new UserPage(driver)
////			.MenuNavPage();
////			
//			new UserPage(driver)
//			.OurplanNavPage();
//			
////			new UserPage(driver)
////			.HowItWorksNavPage();
	////
////			
////			new HomePage(driver)
////			.VideoPlayback();
////			
////			new MenuPage(driver)
////			.selectDate();
//			
//			new OurPlanPage(driver)
//			.SelectOptions();
//			
////			new HowItWorksPage(driver)
////			.HowItWorks();
		
	}
	
}

