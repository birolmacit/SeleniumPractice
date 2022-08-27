package myPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test04 {
    public static void main(String[] args) throws InterruptedException {
          /*Home Work: Log in Test Using Css
1 ) Bir class oluşturun : Locators_css
2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
b. Locate email textbox
c. Locate password textbox ve
d. Locate signin button
e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
i. Username : testtechproed@gmail.com
ii. Password : Test1234!
NOT: cssSelector kullanarak elementleri locate ediniz.
*/


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize() ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000) );

        //a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in") ;

     /*  // b. Locate email textbox
        c. Locate password textbox ve
        d. Locate signin button
        e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!*/



        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Test1234!");
        driver.findElement(By.cssSelector("input[type='submit']")).click() ;



        Thread.sleep(5000);
        driver.close() ;



    }
}
