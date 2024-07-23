package userpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HeaderTest {
	
	
		WebDriver driver=null;
	
       	public HeaderTest(RemoteWebDriver driver7) {
       		this.driver=driver7;
       		
	}
       	
       	public void Header() {
       		
//       	// Verify the logo
//            WebElement logo = driver.findElement(By.className("app_logo"));
//            if (logo.isDisplayed()) {
//                System.out.println("Logo is displayed correctly.");
//            } else {
//                System.out.println("Logo is not displayed.");
//            }

       	// Verify navigation links
       		String[] navLinks = {"Home", "Menu", "Our Plan", "How it works"};
       		for (String linkText : navLinks) {
       		    WebElement navLink = driver.findElement(By.xpath("//mat-nav-list[@role='navigation']"));
       		    if (navLink.isDisplayed()) {
       		        System.out.println(linkText + " link is displayed correctly.");
       		    } else {
       		        System.out.println(linkText + " link is not displayed.");
       		    }
       		}

            // Verify login button
            WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
            if (loginButton.isDisplayed()) {
                System.out.println("Login button is displayed correctly.");
            } else {
                System.out.println("Login button is not displayed.");
            }

            // Click on the login button (if required)
            loginButton.click();
            
            
       		
//       	// Find the logo element
//            WebElement logo = driver.findElement(By.className("app_logo"));
//
//            // Verify if the logo is displayed
//            if (logo.isDisplayed()) {
//                System.out.println("Logo is displayed correctly.");
//            } else {
//                System.out.println("Logo is not displayed.");
//            }
//
//            // Click on the logo to navigate to the home page
//            logo.click();
      
       		
            
//            // Find and click on the "Home" link
//            WebElement homeLink = driver.findElement(By.linkText("Home"));
//            homeLink.click();
//            
//            // Find and click on the "Menu" link
//            WebElement menuLink = driver.findElement(By.linkText("Menu"));
//            menuLink.click();
//            
//            // Find and click on the "About Us" link
//            WebElement aboutUsLink = driver.findElement(By.linkText("Our Plan"));
//            aboutUsLink.click();
//            
//            // Find and click on the "Contact" link
//            WebElement contactLink = driver.findElement(By.linkText("How it works"));
//            contactLink.click();
//            
//            // Find and click on the "Login" button
//            WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
//            loginButton.click();
        

    }
}

