package javas.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


public class Alerts extends DriverSetUp{

    @Test
    public void webPageLoad() throws InterruptedException {
        // Page load and get the title and url
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        System.out.println("Page Title : " + driver.getTitle());
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //Locate first alert
        WebElement clickAlert1 =  driver.findElement(By.xpath("//button[@id='alertButton']"));
        clickAlert1.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
//        Thread.sleep(1000);
        System.out.println("Alert text_1 : " + alert.getText());
//        Thread.sleep(1000);
        alert.accept();

        //Locate second alert
        driver.findElement(By.cssSelector("#timerAlertButton")).click();
        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait1.until(ExpectedConditions.alertIsPresent());
        Alert alert2 = driver.switchTo().alert();
        System.out.println("Alert text_2: " + alert2.getText());
        alert2.accept();

// Confirm Box
        driver.findElement(By.cssSelector("#confirmButton")).click();
////  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        WebDriverWait waitToClick = new WebDriverWait(driver,Duration.ofSeconds(6));
//        waitToClick.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#confirmButton")));
        Alert confirmAlert = driver.switchTo().alert();
//        Thread.sleep(1000);
        System.out.println("Alert text_3: " + confirmAlert.getText());
//        Thread.sleep(1000);
        confirmAlert.dismiss();
        WebElement confirmResult = driver.findElement(By.cssSelector("#confirmResult"));
        System.out.println("Confirm Result : " + confirmResult.getText());



        // Prompt Box
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        Alert promptBoxAlert = driver.switchTo().alert();
        promptBoxAlert.sendKeys("Hello, I am there!");
        System.out.println("Alert text_4 : " + promptBoxAlert.getText());
        promptBoxAlert.accept();
        WebElement promptResult = driver.findElement(By.cssSelector("#promptResult"));
        System.out.println("Prompt result : " + promptResult.getText());

    }


}


