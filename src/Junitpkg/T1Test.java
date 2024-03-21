package Junitpkg;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class T1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void t1() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1159, 864));
    driver.findElement(By.name("q")).sendKeys("pen");
    driver.findElement(By.xpath("//div[@id=\'Zrbbw\']/div/span")).click();
    {
      WebElement element = driver.findElement(By.xpath("//img[contains(@src,\'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAACXBIWXMAAAsSAAALEgHS3X78AAAB3ElEQVQ4jY2TPWhTURTH/+e8l7QNJg0qCJpCSdEnONTFDk5udfILs9mS6iJYpI4VnURXUcRJrFG3gm3tXLpIxaUUIVA/iLRJayQ2Nk1q7cu99zjUF/JhQv7jOff/O+fcwyERAQAQEaoVjsdOirgP93L+W5svJpeq8xVfPWD/yPkepekBWbjETl8nM0h9XtkRV72xLbmdn5hJ/xdw4OaVkC6U7oBwg6MRH0d7fGTbQDoLIYKUXa2/rO5C6SdWOHh/4/HrLQCwvZZUoZi2Dh/ysdPbRZ0dNeOQCMj2WXTiaMCUtsdUKn0dQHcNAEZCVr+DViJjYAW6/NqI34txS0eVIqEwRgfONMTbApyORDE3PIbF9dX2AKPHTyESCFbMExeGMTL9EguZVHuAxY3vmBscwtkjfS3NTQELuQzi72bwaGAQ8elEUzNQtQUiLsmf3X3eCt/n1uBMPQUy2bqSDCIuNXQgjHnJ5kzTUt47rUQY8w0AG2ZcLX/bkc2t5m5mlJdTv22Y8QZAPjGbBPHl8oePRb2yruu9BjBu8msRGrF8YjZZGb3+mA5ePee4ip9xoKOfj/UGSRuYtR/b+ldxyW/paz+fv/0EtLhGT91DF2NgubtXnu4VXk1N1vzFP99f037PUFbu4yIAAAAASUVORK5CYII=\')]"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.xpath("//div[@id=\'rso\']/div/div/div/div/div/div/span/a/h3")).click();
  }
}
