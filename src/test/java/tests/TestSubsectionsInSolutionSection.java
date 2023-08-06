package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.components.MainPage;
import pages.components.SubsectionsInSectionPage;


public class TestSubsectionsInSolutionSection extends TestBase {
  MainPage mainPage = new MainPage();
  SubsectionsInSectionPage subsectionsInSectionPage = new SubsectionsInSectionPage();

  String section = "Решения";
  String[][] subsection = {{"\"/capitalmarkets\"", "Системы трейдинга"},
          {"\"/risks\"", "Управление рисками"},
          {"\"/brokerage\"", "Брокерский бизнес"},
          {"\"/treasury\"", "Казначейство"},
          {"\"/loan\"", "Кредитный конвейер"}};

  @Test
  @Tag("remote")
  @Owner("Kristina Gaevskaya")
  @Epic("Учёба")
  @Story("Дипломный проект")
  @DisplayName("Проверка отображения подразделов в секции 'Решения'")
  @Severity(SeverityLevel.CRITICAL)
  void AutomatedQaSectionPageTest() {
    mainPage.openPage()
            .sectionMouseOn(section);
    subsectionsInSectionPage.listDisplayOn(section);

    for (int i = 0; i < subsection.length; i++) {
      subsectionsInSectionPage.shouldHaveText(subsection[i][0], subsection[i][1]);
    }
  }
}
