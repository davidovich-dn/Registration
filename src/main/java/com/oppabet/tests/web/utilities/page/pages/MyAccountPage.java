package com.oppabet.tests.web.utilities.page.pages;

import core.page.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

  @FindBy(xpath = "//div[@id='accountActivation']")
  private WebElement accountActivationPopUp;
  @FindBy(xpath = "//div[@class='box-modal_close arcticmodal-close']")
  private WebElement accountActivationPopUpCross;

  @FindBy(xpath = "//div[@class='apm-form__col']//div[1]//div[2]//div[1]//div[3]//div[1]")
  private WebElement accountNumber;
  @FindBy(xpath = "//div[@class='apm-form__col']//div[2]//div[2]//div[2]//div[3]//div[1]")
  private WebElement email;
  @FindBy(xpath = "//div[@class='apm-form__group']//div[1]//div[1]//div[3]//div[1]")
  private WebElement surname;
  @FindBy(xpath = "//div[@class='apm-form__group']//div[1]//div[2]//div[3]//div[1]")
  private WebElement name;
  @FindBy(xpath = "//div[7]//div[3]//div[1]")
  private WebElement country;
  @FindBy(xpath = "//div[8]//div[3]//div[1]")
  private WebElement region;
  @FindBy(xpath = "//div[9]//div[3]//div[1]")
  private WebElement city;

  public MyAccountPage() {
    super();
  }

  @Step("Проверяем отображается ли попап \"Account activation\".")
  public boolean isAccountActivationPopUpDisplayed() {
    return isElementPresent(accountActivationPopUp);
  }

  @Step("Закрываем попап \"Account activation\".")
  public MyAccountPage closeAccountActivationPopUp() {
    if (isAccountActivationPopUpDisplayed()) {
      accountActivationPopUpCross.click();
      return new MyAccountPage();
    } else
      return this;
  }

  @Step("Получаем значение из поля \"Account number\".")
  public String getAccountNumber() {
    return accountNumber.getText();
  }

  @Step("Получаем значение из поля \"E-mail\".")
  public String getEmail() {
    return email.getText();
  }

  @Step("Получаем значение из поля \"Surname\".")
  public String getSurname() {
    return surname.getText();
  }

  @Step("Получаем значение из поля \"First name\".")
  public String getName() {
    return name.getText();
  }

  @Step("Получаем значение из поля \"Country\".")
  public String getCountry() {
    return country.getText();
  }

  @Step("Получаем значение из поля \"Region\".")
  public String getRegion() {
    return region.getText();
  }

  @Step("Получаем значение из поля \"City\".")
  public String getCity() {
    return city.getText();
  }
}
