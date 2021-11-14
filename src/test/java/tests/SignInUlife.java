package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignInUlife {

  @Test
  public void testSignInUlife() {
    String login = "YOUR_LOGIN";
    String password = "YOUR_PASSWORD";

      System.setProperty("webdriver.chrome.driver", "PATH_TO_CHROME_DRIVER");

      WebDriver driver = new ChromeDriver();

      driver.get("https://www.ulife.com.br/login.aspx");

      driver.findElement(By.id("txtLogin")).sendKeys(login);
      driver.findElement(By.id("txtPassword")).sendKeys(password);

      driver.findElement(By.id("imbLogin") ).click();
  }
}
