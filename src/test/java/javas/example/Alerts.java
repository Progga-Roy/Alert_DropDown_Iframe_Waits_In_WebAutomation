package javas.example;


import org.testng.annotations.Test;

import java.time.Duration;


public class Alerts extends DriverSetUp{
    @Test
    public void webPageLoad(){
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());



    }

}
