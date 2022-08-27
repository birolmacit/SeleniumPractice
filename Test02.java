package myPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test02 {
    /*Main method oluşturun ve aşağıdaki görevi tamamlayın.
         a. http://a.testaddressbook.com adresine gidiniz.
         b. Sign in butonuna basin
         c. email textbox,password textbox, and signin button elementlerini locate ediniz..
         d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
                 i. Username : testtechproed@gmail.com
                 ii. Password : Test1234!
         e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
         f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

         Sayfada kac tane link oldugunu bulun.

        */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
        WebDriver tarayıcı=new ChromeDriver() ;
        tarayıcı.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        tarayıcı.manage().window().maximize();

        tarayıcı.get("http://a.testaddressbook.com");
        tarayıcı.findElement(By.id("sign-in")).click();



        WebElement email=tarayıcı.findElement(By.id("session_email"));
        WebElement password=tarayıcı.findElement(By.id("session_password"));
        WebElement signin=tarayıcı.findElement(By.name("commit")) ;
        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signin.click();



        String expectedemail= tarayıcı.findElement(By.className("navbar-text")).getText();
        System.out.println(expectedemail);
        System.out.println(expectedemail.equals("testtechproed@gmail.com") ? "test  passed" : "test failed");

        System.out.println(tarayıcı.findElement(By.className("navbar-text")).isDisplayed() ? "address is displayed" : "address not displayed");
        System.out.println(tarayıcı.findElement(By.linkText("Sign out")).isDisplayed() ? "signout is displayed" : "signout not displayed");

        List<WebElement > linksayisi=tarayıcı.findElements(By.tagName("a")) ;
        System.out.println(linksayisi.size());


        Thread.sleep(10000);
        tarayıcı.close();
    }
}
