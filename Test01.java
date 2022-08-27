package myPractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test01 {
    /*
        1.https://www.amazon.com url sine gidin
        2.baslıgın Amazon  (BUYUK HARFLE) kelimesi icerdiğini test edin
        3.url nin  https://www.amazon.com   a esit oldugunu test edin
        4.sayfayı kapatın
         */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize() ;


        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String aranankelime="Amazon";

        System.out.println(actualTitle.contains(aranankelime) ? "title test passed" : "title test failed");


        String actualurl=driver.getCurrentUrl();
        System.out.println(actualurl);
        String urlExpected = "https://www.amazon.com";

        System.out.println(actualurl.equals(urlExpected) ? "url test passed" : "url test failed");

        driver.close() ;




    }
}
