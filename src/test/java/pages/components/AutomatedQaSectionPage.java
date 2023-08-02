package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AutomatedQaSectionPage {
  // SelenideElements / locator / etc


  SelenideElement link = $("[href=\"/automatedqa\"]"),
          //sectionName = $(byText("Тестирование")),
          classAuto = $("#tab2_550987857"),
          classSubsection = $("div #rec551026942"),
          fieldTextNumber = $(".tn-elem__5510269421676430365188 > div:nth-child(1)");


  @Step("Переход в раздел '{value}'")
  public AutomatedQaSectionPage servicesDisplayOn(String value) {
    link.shouldBe(visible);
    //sectionName.click();
    $(byText(value)).click();

    return this;
  }

  @Step("Проверка отображения текста: '{value}'")
  public AutomatedQaSectionPage shouldHaveText(String value) {
    classSubsection.scrollIntoView(false);
    fieldTextNumber.shouldHave(ownText(value));

    return this;
  }

  @Step("Поиск подраздела '{value}'")
  public AutomatedQaSectionPage searchSubsection(String value) {
    classAuto.shouldHave((text(value))).click();

    return this;
  }


}
