package javas.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Iframe  extends DriverSetUp{
    @Test
    public void handleIframe(){
        //Load the page and get the title and url
        driver.get("https://demoqa.com/frames");
        System.out.println("Site name : " + driver.getTitle());
        System.out.println("Current Url : " + driver.getCurrentUrl());
        WebElement  pageName =  driver.findElement(By.className("text-center"));
        System.out.println("Page Name : " + pageName.getText());
        //Inside the iframe
        driver.switchTo().frame("frame1");
        WebElement h1 =  driver.findElement(By.id("sampleHeading"));
        System.out.println("H1 from iframe: " + h1.getText());
        //Back to the main content
        driver.switchTo().defaultContent();
        WebElement p = driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page There are 2 Iframes in this pag')]"));
        System.out.println("P : " + p.getText());
        driver.switchTo().frame(1);
        WebElement h2 = driver.findElement(By.id("sampleHeading"));
        System.out.println("H2 : " + h2.getText());

        driver.switchTo().parentFrame();
        WebElement cssPropertiesFrame1 = driver.findElement(By.id("frame1Wrapper"));
        System.out.println("Frame 1 : Bg-color : " + cssPropertiesFrame1.getCssValue("background-color"));
        System.out.println("Frame 1 : Width : " + cssPropertiesFrame1.getCssValue("width"));
        System.out.println("Frame 1 : Height : " + cssPropertiesFrame1.getCssValue("height"));

        driver.switchTo().frame("frame2");
        WebElement cssPropertiesFrame2 = driver.findElement(By.id("sampleHeading"));
        System.out.println("Frame 2 : Bg-color : " + cssPropertiesFrame2.getCssValue("background-color"));
        System.out.println("Frame 2 : Width : " + cssPropertiesFrame2.getCssValue("width"));
        System.out.println("Frame 2 : Height : " + cssPropertiesFrame2.getCssValue("height"));

        driver.switchTo().defaultContent();
        WebElement  Name =  driver.findElement(By.className("text-center"));
        System.out.println("Page Name : " + Name.getText());

    }
}
