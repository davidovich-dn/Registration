package com.oppabet.tests.web.suites;

import com.oppabet.tests.web.utilities.Utills;
import com.oppabet.tests.web.utilities.businessObjects.User;
import com.oppabet.tests.web.utilities.page.pages.MainPage;
import com.oppabet.tests.web.utilities.page.pages.RegistrationPage;
import com.oppabet.tests.web.utilities.page.pages.blocks.MustLogInPopUp;
import core.testCase.BaseTestCase;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class Sample_Test extends BaseTestCase {

  private User user = Utills.generateUser();

  @Step("Проверки регистрации пользователя.")
  @Feature("Registration")
  @Story("1. Registration. Регистрация пользователя.")
  @Test
  public void registration() throws InterruptedException {
    //1
    RegistrationPage registrationPage = new MainPage().clickRegistrationButton();
    //2
    MustLogInPopUp popUp = registrationPage.fillRegistrationForm(user);

    Thread.sleep(3000);
    //3
    //4
    //5
  }
}
