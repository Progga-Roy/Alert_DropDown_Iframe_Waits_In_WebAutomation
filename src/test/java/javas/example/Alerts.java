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
    public void webPageLoad(){
        // Page load and get the title and url
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        System.out.println("Page Title : " + driver.getTitle());
        System.out.println("Current Url : " + driver.getCurrentUrl());

        //Locate first alert
        WebElement clickAlert1 =  driver.findElement(By.xpath("//button[@id='alertButton']"));
        clickAlert1.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text : " + alert.getText());
        alert.accept();



    }


    }


