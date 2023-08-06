package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.components.MainPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class TestSubsectionsInSolutionSection extends TestBase {
  MainPage mainPage = new MainPage();

  String section = "Решения";
  String[][] subsection = {{"capitalmarkets", "Системы трейдинга"},
          {"risks", "Управление рисками"},
          {"brokerage", "Брокерский бизнес"},
          {"treasury", "Казначейство"},
          {"loan", "Кредитный конвейер"}};

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
    for (int i = 0; i < subsection.length; i++) {
      for (int j = 0; j < subsection[i].length; j++) {
        $("[href=\"/" + subsection[i][j] + "\"]").shouldBe(visible).shouldHave(Condition.text(subsection[i][j++]));
      }
    }
    /*$("[href=\"/capitalmarkets\"]").shouldBe(visible).shouldHave(Condition.text("Системы трейдинга"));
    $("[href=\"/risks\"]").shouldHave(Condition.text("Управление рисками"));
    $("[href=\"/brokerage\"]").shouldHave(Condition.text("Брокерский бизнес"));
    $("[href=\"/treasury\"]").shouldHave(Condition.text("Казначейство"));
    $("[href=\"/loan\"]").shouldHave(Condition.text("Кредитный конвейер"));*/

  }
}
