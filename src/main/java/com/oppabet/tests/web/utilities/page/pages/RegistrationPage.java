package com.oppabet.tests.web.utilities.page.pages;

import com.oppabet.tests.web.utilities.businessObjects.User;
import com.oppabet.tests.web.utilities.page.pages.blocks.MustLogInPopUp;
import core.page.BasePage;
import core.selenium.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;

public class RegistrationPage extends BasePage {

  @FindBy(xpath = "//*[contains(text(),'By e-mail')]")
  private WebElement byEmail;
  @FindBy(xpath = "//div[@class='c-registration__block c-registration__block--country']//div[@class='multiselect c-registration__select']")
  private WebElement countryInput;
  @FindBy(xpath = "//input[contains(@placeholder,'Select country')]")
  private WebElement countryInputSend;
  @FindBy(xpath = "//div[@class='c-registration__block c-registration__block--region']//div[@class='multiselect c-registration__select']")
  private WebElement regionInput;
  @FindBy(xpath = "//input[contains(@placeholder,'Select region')]")
  private WebElement regionInputSend;
  @FindBy(xpath = "//div[@class='c-registration__block c-registration__block--city']//div[@class='multiselect c-registration__select']")
  private WebElement cityInput;
  @FindBy(xpath = "//input[contains(@placeholder,'Select city')]")
  private WebElement cityInputSend;
  @FindBy(xpath = "//div[@class='multiselect c-registration__select multiselect--above']")
  private WebElement currencyInput;
  @FindBy(xpath = "//input[@id='popup_registratio_email']")
  private WebElement emailInput;
  @FindBy(xpath = "//input[@id='popup_registratio_name']")
  private WebElement nameInput;
  @FindBy(xpath = "//input[@id='popup_registratio_surname']")
  private WebElement surnameInput;
  @FindBy(xpath = "//input[@id='popup_registratio_password']")
  private WebElement passwordInput;
  @FindBy(xpath = "//input[@id='popup_registratio_password_again']")
  private WebElement passwordAgainInput;
  @FindBy(xpath = "//div[@class='c-registration__button button button_light submit_registration']")
  private WebElement registerButton;

  public RegistrationPage() {
    super();
  }

  @Step("Нажимаем на вкладку \"By e-mail\".")
  public RegistrationPage clickByEmail() {
    byEmail.click();
    return new RegistrationPage();
  }

  @Step("Проверяем отображается ли элемент \"Select region\".")
  public Boolean isSelectRegionInputDisplayed() {
    return isElementPresent(regionInput);
  }

  @Step("Выбираем страну \"{country}\".")
  public RegistrationPage selectCountry(String country) {
    (new WebDriverWait(Driver.getDriver(), 30)).until(ExpectedConditions
            .elementToBeClickable(countryInput));
    countryInput.sendKeys(country);
    countryInputSend.sendKeys(Keys.ENTER);
    return new RegistrationPage();
  }

  @Step("Выбираем регион \"{region}\".")
  public RegistrationPage selectRegion(String region) {
    if (isSelectRegionInputDisplayed()) {
      regionInput.sendKeys(region);
      regionInput.sendKeys(Keys.ENTER);
      return new RegistrationPage();
    } else
      return this;
  }

  @Step("Выбираем регион \"{region}\".")
  public RegistrationPage selectRegion(int region) {
    if (isSelectRegionInputDisplayed()) {
      for (int i = 0; i < region; i++) {
        (new WebDriverWait(Driver.getDriver(), 30)).until(ExpectedConditions
                .elementToBeClickable(regionInputSend));
        regionInputSend.sendKeys(Keys.DOWN);
      }
      regionInputSend.sendKeys(Keys.ENTER);
      return new RegistrationPage();
    } else
      return this;
  }

  @Step("Получаем значение из поля \"Select region\".")
  public String getRegion() {
    if (isElementPresent(regionInput)) {
      return regionInput.getAttribute("value");
    }
    throw new RuntimeException("При попытке получить значение из поля \"Select region\" ничего не было получено");
  }

  @Step("Выбираем город \"{city}\".")
  public RegistrationPage selectCity(String city) {
    cityInput.sendKeys(city);
    cityInput.sendKeys(Keys.ENTER);
    return new RegistrationPage();
  }

  @Step("Выбираем город \"{city}\".")
  public RegistrationPage selectCity(int city) {
    for (int i = 0; i < city; i++) {
      cityInputSend.sendKeys(Keys.DOWN);
    }
    cityInputSend.sendKeys(Keys.ENTER);
    return new RegistrationPage();
  }

  @Step("Получаем значение из поля \"Select city\".")
  public String getCity() {
    if (isElementPresent(cityInput)) {
      return cityInput.getAttribute("value");
    }
    throw new RuntimeException("При попытке получить значение из поля \"Select city\" ничего не было получено");
  }

  @Step("Выбираем валюту \"{currency}\".")
  public RegistrationPage selectCurrency(String currency) {
    currencyInput.sendKeys(currency);
    currencyInput.sendKeys(Keys.ENTER);
    return new RegistrationPage();
  }

  @Step("Получаем значение из поля \"Select currency\".")
  public String getCurrency() {
    return currencyInput.getAttribute("value");
  }

  @Step("Вводим email.")
  public RegistrationPage typeEmail(String email) {
    emailInput.click();
    int length = emailInput.getAttribute("value")
            .length();
    for (int i = 0; i < length; i++) {
      emailInput.sendKeys(Keys.RIGHT);
      emailInput.sendKeys(Keys.BACK_SPACE);
    }
    emailInput.sendKeys(email);
    return this;
  }

  @Step("Вводим имя.")
  public RegistrationPage typeName(String name) {
    nameInput.click();
    int length = nameInput.getAttribute("value")
            .length();
    for (int i = 0; i < length; i++) {
      nameInput.sendKeys(Keys.RIGHT);
      nameInput.sendKeys(Keys.BACK_SPACE);
    }
    nameInput.sendKeys(name);
    return this;
  }

  @Step("Вводим фамилию.")
  public RegistrationPage typeSurname(String surname) {
    surnameInput.click();
    int length = surnameInput.getAttribute("value")
            .length();
    for (int i = 0; i < length; i++) {
      surnameInput.sendKeys(Keys.RIGHT);
      surnameInput.sendKeys(Keys.BACK_SPACE);
    }
    surnameInput.sendKeys(surname);
    return this;
  }

  @Step("Вводим пароль.")
  public RegistrationPage typePassword(String password) {
    passwordInput.click();
    int length = passwordInput.getAttribute("value")
            .length();
    for (int i = 0; i < length; i++) {
      passwordInput.sendKeys(Keys.RIGHT);
      passwordInput.sendKeys(Keys.BACK_SPACE);
    }
    passwordInput.sendKeys(password);
    return this;
  }

  @Step("Подтверждаем пароль.")
  public RegistrationPage typePasswordAgain(String passwordAgain) {
    passwordAgainInput.click();
    int length = passwordAgainInput.getAttribute("value")
            .length();
    for (int i = 0; i < length; i++) {
      passwordAgainInput.sendKeys(Keys.RIGHT);
      passwordAgainInput.sendKeys(Keys.BACK_SPACE);
    }
    passwordAgainInput.sendKeys(passwordAgain);
    return this;
  }

  @Step("Заполняем поля формы регистрации.")
  public MustLogInPopUp fillRegistrationForm(User user) {
    String pwd = user.getPassword();
    int region = 0;
    int city = 0;
    for (Integer integer : user.getRegion().keySet()) {
      region = integer;
    }
    for (Integer integer : user.getCity().keySet()) {
      city = integer;
    }
    selectCountry(user.getCountry());
    selectRegion(region);
    selectCity(city);
    typeEmail(user.getEmail());
    typeName(user.getName());
    typePassword(pwd);
    typePasswordAgain(pwd);
    return clickRegisterButton();
  }

  @Step("Нажимаем кнопку \"Register\".")
  public MustLogInPopUp clickRegisterButton() {
    registerButton.click();
    return new MustLogInPopUp();
  }
}
