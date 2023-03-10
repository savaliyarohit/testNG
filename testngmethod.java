
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class testngmethod {

WebDriver driver;


@Test
void openBrowser() throws InterruptedException {

    System.out.println("openBrowser");
    WebDriverManager.edgedriver().setup();
    WebDriver driver = new EdgeDriver();
    driver.get("https://demo.nopcommerce.com/");
    driver.manage().window().maximize();

    Thread.sleep(2000);

    driver.findElement(By.className("ico-register")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("gender-male")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("FirstName")).sendKeys("Rohit");
    driver.findElement(By.id("LastName")).sendKeys("Savaliya");
    Thread.sleep(2000);
   driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("5");
    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).sendKeys("May");
    driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys("2001");
    Thread.sleep(2000);
    driver.findElement(By.id("Email")).sendKeys("savaliyarohit@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.id("Company")).sendKeys("TATA pvt.ltd.");
    Thread.sleep(2000);
    driver.findElement(By.id("Password")).sendKeys("Rohit%111");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("Rohit%111");
    Thread.sleep(2000);
    driver.findElement(By.id("register-button")).click();



}

}
