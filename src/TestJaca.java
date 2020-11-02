import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestJaca {

    WebDriver driver;

    @BeforeClass
    void setupFireFox() {
        System.setProperty("webdriver.chrome.driver","S:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

    }

//    @BeforeClass
//    void setupChrome() {
//        System.setProperty("webdriver.chrome.driver","S:\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demoqa.com/");
//
//    }

    @Test(priority = 1)
    void logoTest() {
        WebElement logoObject = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
        System.out.println(logoObject.getSize().toString());
        Assert.assertTrue(logoObject.isDisplayed());
        //Assert.assertTrue(logoObject.isDisplayed(), "Logo is not displayed or either available");
//
//        WebElement file = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
//        if (file.isDisplayed()) {
//            System.out.println("Image displayed.");
//        } else {
//            System.out.println("Image Not displayed.");
//        }

    }

    @Test(priority = 0)
    void titleTest() {
        System.setProperty("webdriver.chrome.driver","S:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");

        System.out.println("Title of the DemoQA website is: " + driver.getTitle().toString());
        Assert.assertEquals("ToolsQA", driver.getTitle(), "Title is not proper or either not matching");
//        String actualTitle = "ToolsQA";
//        Assert.assertEquals(driver.getTitle(), actualTitle);

    }

    @AfterClass
    void teardown() {
        driver.quit();
    }
}