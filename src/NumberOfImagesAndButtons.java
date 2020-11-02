import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class NumberOfImagesAndButtons {
    @Test
    public void ImagesAndButtons() throws Exception {

        //creating selenium environment for testing
        System.setProperty("webdriver.chrome.driver", "S:\\chromedriver.exe");
        //New object for browser
        WebDriver driver = new ChromeDriver();

        System.out.println("Opening Demo Website :");
        // Getting the webpage
        driver.get("https://demoqa.com/");
        Thread.sleep(20000);

        // Getting all the images and showing
        System.out.println("Creating List to store image elements...");
        System.out.println("Getting all the image elements...");

        List<WebElement> listImages = driver.findElements(By.tagName("img"));
        // If no elements found condition;
        if(listImages.size() == 0){
            System.out.println("There are no images Here");
            System.out.println("Images :" + listImages.size());
        }
        else{
            System.out.println("Images :" + listImages.size());
        }

        // Getting all the Buttons and showing
        System.out.println("Creating List to store Button elements...");
        System.out.println("Getting all the Buttons elements...");
        // List to store
        List<WebElement> listButtons = driver.findElements(By.tagName("button"));
        // If no elements found condition;
        if(listButtons.size() == 0){
            System.out.println("There are no Buttons Here");
            System.out.println("Buttons :" + listButtons.size());
}
        else{
            System.out.println("Buttons :" + listButtons.size());
        }




        driver.quit();

    }
}