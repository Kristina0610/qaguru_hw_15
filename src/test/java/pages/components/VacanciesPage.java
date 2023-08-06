package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class VacanciesPage {
  // SelenideElements / locator / etc


  SelenideElement list = $(".tn-elem__3403764841627561635844 > a:nth-child(1)"),
          text = $("[field=\"title\"]");


  @Step("Переход в раздел '{value}'")
  public VacanciesPage servicesDisplayOn(String value) {
    $(byText(value)).click();

    return this;
  }

  @Step("Переход в '{value}'")
  public VacanciesPage listOfVacanсies(String value) {
    list.shouldHave(text(value)).click();

    return this;
  }

  @Step("Проверка отображения текста: '{value}'")
  public VacanciesPage shouldHaveText(String value) {
    text.shouldHave(text(value));

    return this;
  }

}
