package javas.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Waits extends DriverSetUp {
    @Test
    public void differentWaits(){
        driver.get("https://demoqa.com/dynamic-properties");
        System.out.println("Site name : " + driver.getTitle());
        System.out.println("Current Url : " + driver.getCurrentUrl());
        WebElement pageName = driver.findElement(By.className("text-center"));
        System.out.println("Page Name : " + pageName.getText());


        driver.findElement(By.id("enableAfter")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement text =   wait.until(ExpectedConditions.elementToBeClickable(By.id("colorChange")));
        System.out.println(text.getText());
        WebElement text2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        System.out.println(text2.getText());


    }
}
