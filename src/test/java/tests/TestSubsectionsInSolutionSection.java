package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.components.MainPage;

import static com.codeborne.selenide.Selenide.$;


public class TestSubsectionsInSolutionSection extends TestBase {
  MainPage mainPage = new MainPage();

  String section = "Решения";

  @Test
  @Tag("remote")
  @Owner("Kristina Gaevskaya")
  @Epic("Учёба")
  @Story("Дипломный проект")
  @DisplayName("Проверка отображения подразделов в секции 'Решения'")
  @Severity(SeverityLevel.CRITICAL)
  void AutomatedQaSectionPageTest() {
    mainPage.openPage()
            .closeCookie()
            .sectionMouseOn(section);
    //$("[href=\"/capitalmarkets\"]").shouldHave(Condition.text("Системы трейдинга"));
    $(".t-menusub__menu_bottom > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)").shouldHave(Condition.text("Системы трейдинга"));
    $("[href=\"/risks\"]").shouldHave(Condition.text("Управление рисками"));
    $("[href=\"/brokerage\"]").shouldHave(Condition.text("Брокерский бизнес"));
    $("[href=\"/treasury\"]").shouldHave(Condition.text("Казначейство"));
    $("[href=\"/loan\"]").shouldHave(Condition.text("Кредитный конвейер"));

  }
}
