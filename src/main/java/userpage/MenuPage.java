package userpage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {
    
    WebDriver driver= null;
    
    public MenuPage(RemoteWebDriver driver3) {
        this.driver = driver3;    
    }
    
    public void selectDate() {
            
            List<WebElement> dateButtons = driver.findElements(By.xpath("//div[@class='button btn btn-outline-success mt-2 mb-4 ng-star-inserted']"));

         // Iterate through each date button
         for (WebElement button : dateButtons) {
             // Click the button
             button.click();

             // Add a delay of 1 second (1000 milliseconds)
             try {
                 Thread.sleep(1000); // 1 second delay
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }

             // Wait for the heading element to be visible
             WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // 30 seconds timeout
             WebElement headingElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu_date_text_column']")));

             // Get the heading text
             String headingText = headingElement.getText();

             // Print the heading text
             System.out.println("Heading Text: " + headingText);
             
             
//           WebElement dateButton = driver.findElement(By.cssSelector("body > app-root:nth-child(1) > app-landing-page:nth-child(2) > mat-sidenav-container:nth-child(1) > mat-sidenav-content:nth-child(5) > app-our-menu:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)"));
             //
//                     // Click the date button
//                     dateButton.click();
             //
//                     // Wait for the heading element to be visible
//                     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
//                     WebElement headingElement9 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Apr 1 - Apr 7')]")));
             //
//                     // Get the heading text
//                     String headingText9 = headingElement9.getText();
             //
//                     // Print the heading text
//                     System.out.println("Heading Text: " + headingText9);
//                     
//                     
//                     //April 8-14
//                     // Wait for the heading element to be visible
//                     WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
//                     WebElement headingElement10 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Apr 8 - Apr 14')]")));
             //
//                     // Get the heading text
//                     String headingText10 = headingElement10.getText();
             //
//                     // Print the heading text
//                     System.out.println("Heading Text: " + headingText10);
//                     
//                   //April 15-21
//                     // Wait for the heading element to be visible
//                     WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
//                     WebElement headingElement11 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Apr 15 - Apr 21')]")));
             //
//                     // Get the heading text
//                     String headingText11 = headingElement11.getText();
             //
//                     // Print the heading text
//                     System.out.println("Heading Text: " + headingText11);
                     
//                 	List<WebElement> dateButtons = driver.findElements(By.xpath("//div[@class='button btn btn-outline-success mt-2 mb-4 ng-star-inserted']"));
//                     
//                     // Iterate through each date button
//                     for (WebElement button : dateButtons) {
//                         // Click the button
//                         button.click();
             //
//                         // Wait for the heading element to be visible
//                         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // 30 seconds timeout
//                         WebElement headingElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='menu_date_text_column']")));
             //
//                         // Get the heading text
//                         String headingText = headingElement.getText();
             //
//                         // Print the heading text
//                         System.out.println("Heading Text: " + headingText);
             
             
         }

        }
        
    }
