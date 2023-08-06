package pages.components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SubsectionsInSectionPage {
  // SelenideElements / locator / etc


  SelenideElement list = $("ul [role=\"list\"]");


  @Step("Сделать список '{value}' видимым")
  public SubsectionsInSectionPage listDisplayOn(String value) {
    list.shouldBe(cssValue("display", "block"));
            //.shouldBe(visible);

    return this;
  }


  @Step("Проверка отображения подраздела: '{value2}'")
  public SubsectionsInSectionPage shouldHaveText(String value1, String value2) {
    $("[href=" + value1 + "]").shouldHave(Condition.innerText(value2));
    return this;
  }

}
