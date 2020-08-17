package com.oppabet.tests.web.utilities.page.pages;

import core.page.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

  @FindBy(xpath = "//*[@id='registation_button']")
  private WebElement registrationButton;

  public MainPage() {
    super();
  }

  @Step("Нажимаем на кнопку \"Registration\".")
  public RegistrationPage clickRegistrationButton() {
    registrationButton.click();
    return new RegistrationPage();
  }
}
