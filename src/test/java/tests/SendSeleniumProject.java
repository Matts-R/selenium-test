package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SendSeleniumProject {

  @Test
  public void testSubmitSeleniumProject() {
    String login = "YOUR_LOGIN";
    String password = "YOUR_PASSWORD";
    String projectHref = "https://student.ulife.com.br/Category/Index?lc=wyH6xhXLmB2zdl3uvvuv%2fQ%3d%3d&l=KoAZHOkV%2b9Q0kwIwuF0ZlA%3d%3d&cd=WGB2QTpYORIJ5YhJ%2fg%2f2Ew%3d%3d&sl=ACFdBAwNYJcCXLzBpH3P2A%3d%3d&st=ACFdBAwNYJcCXLzBpH3P2A%3d%3d&oi=F9mBM7oKm6F4uGFOFxjAQQ%3d%3d";
    System.setProperty("webdriver.chrome.driver", "PATH_TO_CHROME_DRIVER");

      WebDriver driver = new ChromeDriver();

      driver.get("https://www.ulife.com.br/login.aspx");

      driver.findElement(By.id("txtLogin")).sendKeys(login);
      driver.findElement(By.id("txtPassword")).sendKeys(password);

      driver.findElement(By.id("imbLogin")).click();

      WebDriverWait timeout = new WebDriverWait(driver, 15);

      WebElement element = timeout.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='" + projectHref + "']")));

      element.click();

      WebElement message = timeout.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='fmb db fBold']")));
      String response = message.getText();

      assertEquals("VOCÊ NÃO PODE MAIS RESPONDER ESTA ATIVIDADE", response);
  }
}
