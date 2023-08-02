package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
  // SelenideElements / locator / etc
  SelenideElement menubar = $("[role = list]"),
          closeCookie = $("[aria-label=\"Закрыть уведомление\"]");


  @Step("Открываем главную страницу")
  public MainPage openPage() {
    open("/");

    return this;
  }

  @Step("Проверяем отображения на странице раздела '{value}'")
  public MainPage servicesDisplayOn(String value) {
    menubar.shouldHave(text(value));

    return this;
  }

  @Step("Наводим мышку на раздел {value}")
  public MainPage sectionMouseOn(String value) {
    menubar.$(byText(value)).hover();

    return this;
  }

  @Step("Закрыть информацию о Cookie")
  public MainPage closeCookie() {
    closeCookie.click();

    return this;
  }

}
