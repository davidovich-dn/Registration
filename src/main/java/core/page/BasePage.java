package core.page;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import core.selenium.Driver;

public abstract class BasePage {

  public BasePage()
  {
    PageFactory.initElements(Driver.getDriver(), this);
  }

  public boolean isElementPresent(WebElement element) {
    boolean result;
    try {
      result = element.isDisplayed();
    } catch (NoSuchElementException e) {
      result = false;
    }
    return result;
  }
}