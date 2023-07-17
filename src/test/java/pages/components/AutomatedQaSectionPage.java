package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AutomatedQaSectionPage {
  // SelenideElements / locator / etc
  MainPage mainPage = new MainPage();

  SelenideElement link = $("[href=\"/automatedqa\"]");


  @Step("Переход в раздел '{value}'")
  public AutomatedQaSectionPage servicesDisplayOn(String value) {
    $(byText(value)).shouldBe(visible).click();
    //link.click();

    return this;
  }


}
