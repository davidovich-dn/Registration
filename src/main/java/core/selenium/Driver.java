package core.selenium;

import core.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

  private static WebDriver driver;

  public static WebDriver getDriver(){
    if (driver == null){
      setDriver();
    }
    return driver;
  }

  private static void setDriver(){
    System.setProperty(Data.WEBDRIVER_CHROME_DRIVER,
            Data.CHROMEDRIVER_EXE_PATH);
    driver = new ChromeDriver();
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.navigate().to(Data.URL);
  }

  public static void closeDriver(){
    driver.quit();
    driver = null;
  }
}
