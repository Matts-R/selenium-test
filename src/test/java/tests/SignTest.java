package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignTest {
  @Test
  public void testSignInFacebookAccount(){
    String login = "YOUR_LOGIN";
    String password = "YOUR_PASSWORD";

       System.setProperty("webdriver.chrome.driver", "PATH_TO_CHROME_DRIVER");

       WebDriver driver = new ChromeDriver();

       driver.get("https://www.facebook.com/");

       driver.findElement(By.id("email")).sendKeys(login);
       driver.findElement(By.id("pass")).sendKeys(password);

       driver.findElement(By.name("login")).click();
  }
}

//Testing
//testing@gmail.com
//123456
