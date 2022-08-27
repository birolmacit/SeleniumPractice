package myPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test03 {
    public static void main(String[] args) {
        //  1-  https://the-internet.herokuapp.com/add_remove_elements/    adresine gidiniz

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize() ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000) );

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");



        //  2- add element butonuna basın
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click() ;


        //    3- delete tusunun görünür olduğunu test edin ve  click edin
        System.out.println(driver.findElement(By.xpath("//button[@class='added-manually']")).isDisplayed() ? "test passed" : "test failed");


        //   4- "ADD/REMOVE ELEMENTS " YAZISININ GORUNUR OLDUGUNU TEST EDİN
        System.out.println(driver.findElement(By.xpath("//h3")).isDisplayed() ? "ADD/REMOVE ELEMENTS display test PASSED" : "ADD/REMOVE ELEMENTS display test FAILED");
        driver.close() ;





    }

    }

