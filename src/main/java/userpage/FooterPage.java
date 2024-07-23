package userpage;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FooterPage {
	
	WebDriver driver= null;

	public FooterPage(RemoteWebDriver driver6) {
		this.driver=driver6;
		
	}
	
	public void Footers() {
		
		WebElement imageElement5 = driver.findElement(By.xpath("//div[@class='logo']//img"));

        // Validate if the image element is present
        if (imageElement5.isDisplayed()) {
            System.out.println("Image is displayed on the webpage.");

            // Validate if the image is loaded correctly
            String srcAttribute = imageElement5.getAttribute("src");
            if (srcAttribute != null && !srcAttribute.isEmpty()) {
                System.out.println("Image source attribute is not empty. Image is loaded correctly.");
            } else {
                System.out.println("Image source attribute is empty. Image may not be loaded correctly.");
            }
        } else {
            System.out.println("Image is not displayed on the webpage.");
        }
		
		WebElement AddressElement= driver.findElement(By.className("address"));
		String AddressText = AddressElement.getText();
        System.out.println("Address Content: " + AddressText);
        
        
//        WebElement Homelink = driver.findElement(By.partialLinkText("Home"));
//        Homelink.click();
        
      //CLicking Home Page Link
      WebElement HomeLink = driver.findElement(By.partialLinkText("Home"));
      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", HomeLink);
	  System.out.println("Clicked the Home Page Link");
	  
	  // Add a wait duration (e.g., 5 seconds) to observe the navigation
	  try {
		    Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	  
	  //CLicking Our Plan Page Link
      WebElement OurPlanLink = driver.findElement(By.partialLinkText("Our pla"));
      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", OurPlanLink);
	  System.out.println("Clicked the Our Plan Page Link");
	  
	// Add a wait duration (e.g., 5 seconds) to observe the navigation
		  try {
			    Thread.sleep(5000); // Wait for 5 seconds
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
		  
	  
	  //CLicking Our Menu Page Link
	  WebElement OurMenuLink = driver.findElement(By.partialLinkText("Our me"));
      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", OurMenuLink);
	  System.out.println("Clicked the Our Menu Page Link");
	  
	  // Add a wait duration (e.g., 5 seconds) to observe the navigation
		  try {
			    Thread.sleep(5000); // Wait for 5 seconds
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
		  
		  
		  //Clicking How it Works Page Link
		  WebElement HowItWorksLink = driver.findElement(By.partialLinkText("How it wor"));
	      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", HowItWorksLink);
		  System.out.println("Clicked the How It Works Page Link");
		  
		  // Add a wait duration (e.g., 5 seconds) to observe the navigation
			  try {
				    Thread.sleep(5000); // Wait for 5 seconds
				} catch (InterruptedException e) {
				    e.printStackTrace();
				}
			  
			  
		WebElement NewsletterElement= driver.findElement(By.className("forms"));
		String NewsletterText = NewsletterElement.getText();
		System.out.println("Newsletter Content: " + NewsletterText);
			  
			  
//			// Locate the email input field
//		        WebElement emailInput = driver.findElement(By.xpath("//input[@placeholder='Enter mail']"));
//
//		        // Enter the email address into the input field
//		        emailInput.sendKeys("example@example.com");

//		        // Locate and click the submit button
//		        WebElement SignUpButton = driver.findElement(By.cssSelector("div[class='forms'] form button"));
//		        SignUpButton.click();

		        // Wait for a few seconds to see the result (optional)
		        try {
		            Thread.sleep(5000); // Wait for 5 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		        
		        
		        WebElement FooterDownElement= driver.findElement(By.className("footer_down"));
				String FooterDownText = FooterDownElement.getText();
		        System.out.println("Newsletter Content: " + FooterDownText);
		  
		        
		
	}
	
		
			
		
	}
