package core.testCase;

import core.selenium.Driver;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTestCase {

  @BeforeAll
  @Step("Открываем браузер.")
  public static void beforeTest(){
    Driver.getDriver();
  }

  @AfterAll
  @Step("Закрываем браузер.")
  public static void afterTest(){
    Driver.closeDriver();
  }
}
