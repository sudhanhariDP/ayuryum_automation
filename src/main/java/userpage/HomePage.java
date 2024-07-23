package userpage;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {
	

	WebDriver driver= null;
	
	public HomePage(RemoteWebDriver driver2) {
		this.driver = driver2;	
	}

	

	public void VideoPlayback() {
		
		    // Wait for the video element to be present
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement videoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//video)[1]")));
		    
		    if (videoElement != null) {
		        System.out.println("Video element found!");
		        // Check if the video is playing
		        boolean isVideoPlaying = (boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].paused === false", videoElement);

		        if (isVideoPlaying) {
		            System.out.println("Video is playing!");
		        } else {
		            System.out.println("Video is not playing!");
		        }
		    } else {
		        System.out.println("Video element not found!");
		    }


		

		
//		// Find the video element
//        WebElement videoElement = driver.findElement(By.xpath("//div[@class='video']//video"));
//        
//        // Verify that the video element is present
//        Assert.assertNotNull(videoElement, "Video element not found");
//
//        // Verify that the video is playing
//        Assert.assertTrue((Boolean) ((JavascriptExecutor) driver).executeScript(
//            "return arguments[0].paused === false", videoElement), "Video is not playing");
        
        
        //Headings
        WebElement headingElement= driver.findElement(By.xpath("//button[normalize-space()='WHY CHOOSE US']"));
		String headingText = headingElement.getText();
        System.out.println("Heading Content: " + headingText);
        
        WebElement headingElement2= driver.findElement(By.xpath("//h4[normalize-space()='Why people choosing us?']"));
		String headingText2 = headingElement2.getText();
		System.out.println("Heading2 Content: "+ headingText2);
		
		WebElement imageElement = driver.findElement(By.xpath("//img[@src='../../../../assets/landing_page_image.jpg']"));

        // Validate if the image element is present
        if (imageElement.isDisplayed()) {
            System.out.println("Image is displayed on the webpage.");

            // Validate if the image is loaded correctly
            String srcAttribute = imageElement.getAttribute("src");
            if (srcAttribute != null && !srcAttribute.isEmpty()) {
                System.out.println("Image source attribute is not empty. Image is loaded correctly.");
            } else {
                System.out.println("Image source attribute is empty. Image may not be loaded correctly.");
            }
        } else {
            System.out.println("Image is not displayed on the webpage.");
        }
        
        
        //Heading for 3 reasons to love Ayuryum.
        WebElement headingElement3 = driver.findElement(By.xpath("//h2[normalize-space()='3 reasons to love Ayuryum']"));
        String headingText3 = headingElement3.getText();
        System.out.println("Heading3 Content: " + headingText3);
        
        
        //Heading for Ayurveda infused recipes.
        WebElement headingElement4 = driver.findElement(By.xpath("//h3[normalize-space()='Ayurveda infused recipes']"));
        String headingText4 = headingElement4.getText();
        System.out.println("Heading4 Content: "+ headingText4);
        
        //paragraph content
        WebElement paragraphElement = driver.findElement(By.xpath("//p[contains(text(),'Recipes carefully created by chef for a healthy li')]"));
        String paragraphText = paragraphElement.getText();
        System.out.println("Paragraph Content: "+ paragraphText);
        
        //heading for Receive your box
        WebElement headingElement5 = driver.findElement(By.xpath("//h3[normalize-space()='Receive your box']"));
        String headingText5 = headingElement5.getText();
        System.out.println("Heading5 Content: "+ headingText5);
        
        //paragraph content 2
        WebElement paragraphElement2 = driver.findElement(By.xpath("//p[contains(text(),'Your freshly prepped meals, delivered at your door')]"));
        String paragraphText2 = paragraphElement2.getText();
        System.out.println("Parapraph2 Content: "+ paragraphText2);
        
        //Heading for Quick meal
        WebElement headingElement6 = driver.findElement(By.xpath("//h3[normalize-space()='Quick meal']"));
        String headingText6 = headingElement6.getText();
        System.out.println("Heading6 Content: "+ headingText6);
        
        //paragraph content 3
        WebElement paragraphElement3 = driver.findElement(By.xpath("//p[contains(text(),'Food so tasty and easy to cook that everyone in yo')]"));
        String paragraphText3 = paragraphElement3.getText();
        System.out.println("Parapraph3 Content: "+ paragraphText3);
        
        //Heading for EASY MEAL WITH HEALTHY ZEAL
        WebElement headingElement7 = driver.findElement(By.xpath("//h2[normalize-space()='EASY MEAL WITH HEALTHY ZEAL']"));
        String headingText7 = headingElement7.getText();
        System.out.println("Heading6 Content: "+ headingText7);
        
        //paragraph content 4
        WebElement paragraphElement4 = driver.findElement(By.xpath("//p[contains(text(),'No need to think outside the box when we can innov')]"));
        String paragraphText4 = paragraphElement4.getText();
        System.out.println("Parapraph3 Content: "+ paragraphText4);
        
        //Menu Button functionality
		WebElement clickButton = driver.findElement(By.xpath("(//button[normalize-space()='Our Menu'])[1]"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickButton);
	    System.out.println("Clicked the button");
	       
        
	}




	
//	public boolean isVideoPlaying() {
//        WebElement videoElement = driver.findElement(By.tagName("video"));
//        if (videoElement != null) {
//            return (boolean) ((JavascriptExecutor) driver)
//                    .executeScript("return arguments[0].paused === false", videoElement);
//        } else {
//            return false;
//        }
//        
//	}
		

		
	
//	public void HeadingCheck() {
//		WebElement headingElement= driver.findElement(By.xpath("//button[normalize-space()='WHY CHOOSE US']"));
//		String headingText = headingElement.getText();
//        System.out.println("Heading Content: " + headingText);
//			
//	}
//	
//	public void HeadingCheck2() {
//		WebElement headingElement2= driver.findElement(By.xpath("//h4[normalize-space()='Why people choosing us?']"));
//		String headingText2 = headingElement2.getText();
//		System.out.println("Heading2 Content: "+ headingText2);		
//		
//	}
//	
//	
//
//	public void MenuButtonCLick() {
//		WebElement clickButton= driver.findElement(By.xpath("(//button[normalize-space()='Our Menu'])[1]"));
//		clickButton.click();
//		System.out.println("Click, "+ clickButton);
//			
//	}
		
		
}

	




