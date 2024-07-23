package userpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OurPlanPage {
	
	WebDriver driver= null;

	public OurPlanPage(RemoteWebDriver driver4) {
		this.driver=driver4;
	}
	
	public void SelectOptions() {
		
		//Step 1:
		WebElement headingElement12= driver.findElement(By.xpath("//h2[normalize-space()='Personalize your plan']"));
		String headingText12 = headingElement12.getText();
        System.out.println("Heading12 Content: " + headingText12);
        
        WebElement headingElement13= driver.findElement(By.xpath("//h3[normalize-space()='1. Choose your preference']"));
		String headingText13 = headingElement13.getText();
        System.out.println("Heading13 Content: " + headingText13);
		
		WebElement VeggiesButton = driver.findElement(By.xpath("(//button[normalize-space()='Veggies'])[1]"));
        VeggiesButton.click();
        
        WebElement PescatarianButton = driver.findElement(By.xpath("//button[normalize-space()='Pescatarian']"));
        PescatarianButton.click();
        
        WebElement VeggiesandMeatButton = driver.findElement(By.xpath("//button[normalize-space()='Veggies & Meat']"));
        VeggiesandMeatButton.click();
        
        WebElement DietaryPreferenceButton = driver.findElement(By.xpath("//button[normalize-space()='Dietary Preference']"));
        DietaryPreferenceButton.click();
        
        WebElement headingElement14= driver.findElement(By.xpath("//h3[normalize-space()='2. Customize your plan']"));
		String headingText14 = headingElement14.getText();
        System.out.println("Heading14 Content: " + headingText14);
        
        
     // Find the question element and the desired option
        WebElement questionElement = driver.findElement(By.xpath("//h4[normalize-space()='Number of people']"));
        WebElement desiredOption = questionElement.findElement(By.xpath("//div[@class='customize_btns']")); // Change to the desired option

        // Click on the desired option
        desiredOption.click();

        // Optionally, you can verify if the desired option is selected
        if (desiredOption.isSelected()) {
            System.out.println("Desired option is selected");
        } else {
            System.out.println("Failed to select the desired option");
        }
        
     // Find the question element2 and the desired option2
        WebElement questionElement2 = driver.findElement(By.xpath("//h4[normalize-space()='Meals per week']"));
        
        WebElement desiredOption2 = questionElement2.findElement(By.xpath("//div[@class='customize_btns px-3']")); // Change to the desired option

        // Click on the desired option
        desiredOption2.click();

        // Optionally, you can verify if the desired option is selected
        if (desiredOption2.isSelected()) {
            System.out.println("Desired option is selected");
        } else {
            System.out.println("Failed to select the desired option");
        }
        
        WebElement CardDisplay = driver.findElement(By.xpath("(//div[@class='calculate card mt-4 p-3'])[1]"));
        String CardDisplayText = CardDisplay.getText();
        System.out.println("Card Display Content: " + CardDisplayText);
        
        //CLicking Next Step Button
        WebElement NextStepButton = driver.findElement(By.xpath("//div[@class='select-plan']//span[@class='mdc-button__label'][normalize-space()='Next step']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", NextStepButton);
  	    System.out.println("Clicked the Next Step button");
  	    
  	    
  	    //Step 2:
  	    // Fill out the form fields
        WebElement firstNameField = driver.findElement(By.xpath("//input[@id='mat-input-1']")); // Adjust locator as needed
        firstNameField.sendKeys("John");

        WebElement lastNameField = driver.findElement(By.xpath("//input[@id='mat-input-2']")); // Adjust locator as needed
        lastNameField.sendKeys("Doe");

        WebElement aptSuiteFloorField = driver.findElement(By.xpath("//input[@id='mat-input-3']")); // Adjust locator as needed
        aptSuiteFloorField.sendKeys("Apt 123");

        WebElement streetAddressField = driver.findElement(By.xpath("//input[@id='mat-input-4']")); // Adjust locator as needed
        streetAddressField.sendKeys("123 Main St");

        WebElement cityField = driver.findElement(By.xpath("//input[@id='mat-input-5']")); // Adjust locator as needed
        cityField.sendKeys("Anytown");

        WebElement zipCodeField = driver.findElement(By.xpath("//input[@id='mat-input-6']")); // Adjust locator as needed
        zipCodeField.sendKeys("12345");

        WebElement stateField = driver.findElement(By.xpath("//input[@id='mat-input-7']")); // Adjust locator as needed
        stateField.sendKeys("CA");

        WebElement phoneNumberField = driver.findElement(By.xpath("//input[@id='mat-input-8']")); // Adjust locator as needed
        phoneNumberField.sendKeys("123-456-7890");
        
        //CLicking Next Step Button
        WebElement NextStep2Button = driver.findElement(By.xpath("//div[@class='container']//span[@class='mat-mdc-button-persistent-ripple mdc-button__ripple']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", NextStep2Button);
  	    System.out.println("Clicked the Next Step2 button");

  	    
//        // Validate if the form is filled correctly
//        WebElement confirmationMessage = driver.findElement(By.id("confirmationMessage")); // Adjust locator as needed
//        if (confirmationMessage.getText().contains("Your address has been submitted successfully")) {
//            System.out.println("Form filled correctly. Address submitted successfully!");
//        } else {
//            System.out.println("Form not filled correctly. Address submission failed.");
//        }
  	    
  	    
//  	    //Step 3:
//  	    // Fill out the credit/debit card form fields
//        WebElement cardNumberField = driver.findElement(By.xpath("//input[@id='mat-input-21']")); // Adjust locator as needed
//        cardNumberField.sendKeys("1234567890123456");
//
//        WebElement expDateField = driver.findElement(By.xpath("//input[@id='mat-input-22']")); // Adjust locator as needed
//        expDateField.sendKeys("12/25");
//
//        WebElement cvvField = driver.findElement(By.xpath("//input[@id='mat-input-23']")); // Adjust locator as needed
//        cvvField.sendKeys("123");
//        
//      //CLicking Next Step Button
//        WebElement PlaceOrderButton = driver.findElement(By.xpath("//span[normalize-space()='Place order & select the menu']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", PlaceOrderButton);
//  	    System.out.println("Clicked the Place Order and Select the Menu Button");

//        // Submit the form
//        WebElement submitButton = driver.findElement(By.xpath("//span[normalize-space()='Place order & select the menu']")); // Adjust locator as needed
//        submitButton.click();

//        // Validate if the form is filled correctly
//        WebElement confirmationMessage = driver.findElement(By.id("confirmationMessage")); // Adjust locator as needed
//        if (confirmationMessage.getText().contains("Your credit/debit card has been added successfully")) {
//            System.out.println("Form filled correctly. Credit/debit card added successfully!");
//        } else {
//            System.out.println("Form not filled correctly. Credit/debit card addition failed.");
//        }
  	    
  	    
//      WebElement questionElement = driver.findElement(By.xpath("//h4[normalize-space()='Number of people']"));

//      // Find the options within the question element
//      WebElement optionA = questionElement.findElement(By.xpath("//div[@class='customize_btns']//button[@class='Veggies ng-star-inserted'][normalize-space()='2']"));
//      WebElement optionB = questionElement.findElement(By.xpath("//button[@class='Veggies ng-star-inserted btn_selected'][normalize-space()='4']"));
//
//      // Select option A
//      optionA.click();
//
//      // Verify if option A is displayed
//      WebElement selectedOption = questionElement.findElement(By.xpath("//div[@class='customize_btns']//button[@class='Veggies ng-star-inserted'][normalize-space()='2']"));
//      if (selectedOption.getText().equals("Option A")) {
//          System.out.println("Option A is displayed");
//      } else {
//          System.out.println("Option A is not displayed");
//      }
//
//      // Select option B
//      optionB.click();
//
//      // Verify if option B is displayed
//      selectedOption = questionElement.findElement(By.xpath("//button[@class='Veggies ng-star-inserted btn_selected'][normalize-space()='4']"));
//      if (selectedOption.getText().equals("Option B")) {
//          System.out.println("Option B is displayed");
//      } else {
//          System.out.println("Option B is not displayed");
//      }
	    
        
	}
	

}
