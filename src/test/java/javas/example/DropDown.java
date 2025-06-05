package javas.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DropDown extends DriverSetUp {
    @Test
    public void  selectDropDown(){
        //Load the page and get the title and url
        driver.get("https://demoqa.com/select-menu");
        System.out.println("Page Title : " + driver.getTitle());
        System.out.println("Current Url : " + driver.getCurrentUrl());

        WebElement  selectOptionByValue = driver.findElement(By.xpath("//div[@id='withOptGroup']//div[contains(@class,'css-1hwfws3')]"));
        selectOptionByValue.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='A root option']")));
        System.out.println(option.getText());



//select One
//      WebElement clickToDropdown =  driver.findElement(By.xpath("//div[@id='selectOne']//div[contains(@class,'css-1hwfws3')]"));
//        clickToDropdown.click();
//        WebElement clickToDropdown =  driver.findElement(By.xpath("//div[@id='selectOne']//div[contains(@class,'css-yk16xz-control')]"));
//        clickToDropdown.click();
//      WebDriverWait waitToClick = new WebDriverWait(driver,Duration.ofSeconds(3));
//      WebElement selectOneOption = waitToClick.until(ExpectedConditions.elementToBeClickable(click));
//      System.out.println(selectOneOption.getText());


    }
}
