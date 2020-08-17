package com.oppabet.tests.web.utilities.page.pages.blocks;

import core.page.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MustLogInPopUp extends BasePage {

  @FindBy(xpath = "//input[@id='userLoginFast']")
  private WebElement idInput;
  @FindBy(xpath = "//input[@id='userPasswordFast']")
  private WebElement passwordInput;
  @FindBy(xpath = "//button[@id='userPasswordFastBtn']")
  private WebElement logInButton;

  public MustLogInPopUp() {
    super();
  }

  @Step("Подучаем значение из поля \"Your ID\".")
  public String getYourID() {
    return idInput.getAttribute("value");
  }

  @Step("Вводим значение \"{yourID}\" в поле \"Your ID\".")
  public MustLogInPopUp typeYourID(String yourID) {
    idInput.sendKeys(yourID);
    return this;
  }

  @Step("Подучаем значение из поля \"Password\".")
  public String getPassword() {
    return passwordInput.getAttribute("value");
  }

  @Step("Вводим значение \"{password}\" в поле \"Password\".")
  public MustLogInPopUp typePassword(String password) {
    passwordInput.sendKeys(password);
    return this;
  }

  @Step("Нажимаем кнопку \"Log in\".")
  public void clickLogIn() {
    logInButton.click();
  }
}
