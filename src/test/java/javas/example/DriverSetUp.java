package javas.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetUp  {
    public WebDriver driver;
    @BeforeSuite
    public void startBrowser(){
        driver =  new ChromeDriver();
    }
    @AfterSuite
    public void closeBrowser(){
        driver.quit();
    }
}
