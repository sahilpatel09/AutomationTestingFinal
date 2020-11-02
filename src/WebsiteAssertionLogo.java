// libraries
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebsiteAssertionLogo {
    @Test
    public void LogoDisplay() throws Exception{
        // Setting up the selenium environment for testing
        System.setProperty("webdriver.chrome.driver","S:\\chromedriver.exe");
        //New Object for driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        //title
        String actualTitle = "ToolsQA";
        // Checking the title
        Assert.assertEquals(driver.getTitle(), actualTitle);

        //Getting the logo file into vairable
        System.out.println("Getting the logo from the website...");
        WebElement file = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
        //Condition to check
        System.out.println("Checking if it is displaying...");
        if (file.isDisplayed()) {
            System.out.println("Logo is being displayed onsite.");
        } else {
            System.out.println("Logo is not displayed onsite.");
        }
        driver.quit();
    }
}