package userpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HowItWorksPage {
	
	WebDriver driver=null;
	
	public HowItWorksPage(RemoteWebDriver driver5) {
		this.driver=driver5;
		
	}
	
	public void HowItWorks() {
		
		//Heading for How Ayuryum Works
		WebElement headingElement8= driver.findElement(By.cssSelector("div[class='col'] h2"));
		String headingText8 = headingElement8.getText();
        System.out.println("Heading Content: " + headingText8);
        
        //Images for Our Plan
        WebElement imageElement2 = driver.findElement(By.xpath("//img[@alt='Plan Image']"));

        // Validate if the image element is present
        if (imageElement2.isDisplayed()) {
            System.out.println("Image is displayed on the webpage.");

            // Validate if the image is loaded correctly
            String srcAttribute2 = imageElement2.getAttribute("src");
            if (srcAttribute2 != null && !srcAttribute2.isEmpty()) {
                System.out.println("Image source attribute is not empty. Image is loaded correctly.");
            } else {
                System.out.println("Image source attribute is empty. Image may not be loaded correctly.");
            }
        } else {
            System.out.println("Image is not displayed on the webpage.");
        }      


		//Heading for Pick your choice of Meal plan
        WebElement headingElement9= driver.findElement(By.xpath("//body//app-root//div[2]//div[2]//h2[1]"));
		String headingText9 = headingElement9.getText();
        System.out.println("Heading9 Content: " + headingText9);
        
        // Paragraph for Recipes carefully created by chef for a healthy lifestyle.
        WebElement paragraphElement5 = driver.findElement(By.xpath("//p[contains(text(),'Recipes carefully created by chef for a healthy li')]"));
        String paragraphText5 = paragraphElement5.getText();
        System.out.println("Parapraph5 Content: "+ paragraphText5);
        
//        //CLicking Our Plans Button
//        WebElement OurPlanButton = driver.findElement(By.xpath("(//button[@class='btn btn-primary'][normalize-space()='Our Plans'])[1]"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", OurPlanButton);
//	    System.out.println("Clicked the Our Plans button");
	
        
	    //Heading for Receive your meal kit
        WebElement headingElement10= driver.findElement(By.xpath("//h2[normalize-space()='2. Receive your meal kit']"));
		String headingText10 = headingElement10.getText();
        System.out.println("Heading10 Content: " + headingText10);
        
        // Paragraph for Recipes carefully created by chef for a healthy lifestyle.
        WebElement paragraphElement6 = driver.findElement(By.xpath("//p[contains(text(),'Your freshly prepped meals, delivered at your door')]"));
        String paragraphText6 = paragraphElement6.getText();
        System.out.println("Parapraph6 Content: "+ paragraphText6); 
        
//        //CLicking Our Plans 2nd Button
//        WebElement OurPlanButton2 = driver.findElement(By.xpath("(//button[@class='btn btn-primary'][normalize-space()='Our Plans'])[2]"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", OurPlanButton2);
//	    System.out.println("Clicked the Our Plans button 2");
        
        
      //Images for Our Plan
        WebElement imageElement3 = driver.findElement(By.xpath("//img[@alt='Plan Image']"));

        // Validate if the image element is present
        if (imageElement3.isDisplayed()) {
            System.out.println("Image is displayed on the webpage.");

            // Validate if the image is loaded correctly
            String srcAttribute3= imageElement3.getAttribute("src");
            if (srcAttribute3 != null && !srcAttribute3.isEmpty()) {
                System.out.println("Image source attribute is not empty. Image is loaded correctly.");
            } else {
                System.out.println("Image source attribute is empty. Image may not be loaded correctly.");
            }
        } else {
            System.out.println("Image is not displayed on the webpage.");
        }
        
        
      //Images for Our Menu
        WebElement imageElement4 = driver.findElement(By.xpath("//img[@alt='Plan Image']"));

        // Validate if the image element is present
        if (imageElement4.isDisplayed()) {
            System.out.println("Image is displayed on the webpage.");

            // Validate if the image is loaded correctly
            String srcAttribute4= imageElement4.getAttribute("src");
            if (srcAttribute4 != null && !srcAttribute4.isEmpty()) {
                System.out.println("Image source attribute is not empty. Image is loaded correctly.");
            } else {
                System.out.println("Image source attribute is empty. Image may not be loaded correctly.");
            }
        } else {
            System.out.println("Image is not displayed on the webpage.");
        }
        
        
        //Heading for Open, Cook & Enjoy
        WebElement headingElement11= driver.findElement(By.xpath("//h2[normalize-space()='3. Open, Cook & Enjoy']"));
		String headingText11 = headingElement11.getText();
        System.out.println("Heading11 Content: " + headingText11);
        
        // Paragraph for Recipes carefully created by chef for a healthy lifestyle.
        WebElement paragraphElement7 = driver.findElement(By.xpath("//p[contains(text(),'Food so tasty and easy to cook that everyone in yo')]"));
        String paragraphText7 = paragraphElement7.getText();
        System.out.println("Parapraph6 Content: "+ paragraphText7);
        
      //CLicking Our Menu Button
      WebElement OurMenuButton = driver.findElement(By.xpath("//button[normalize-space()='Our Menu']"));
      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", OurMenuButton);
	    System.out.println("Clicked the Our Menu button");
	    	    
	    
	}
	    
}		



