package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
  // SelenideElements / locator / etc
  SelenideElement menubar = $("[role = menubar]");

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
  public MainPage sectionClick(String value) {
    menubar.shouldHave(Condition.text(value)).hover();

    return this;
  }

}
