package com.oppabet.tests.web.utilities.page.pages;

import core.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BetsPage extends BasePage {

  @FindBy(xpath = "//a[@href='office/account/']")
  private WebElement myAccountPage;

  public BetsPage() {
    super();
  }
}
