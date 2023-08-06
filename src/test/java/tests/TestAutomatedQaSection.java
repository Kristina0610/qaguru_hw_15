package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.components.AutomatedQaSectionPage;
import pages.components.MainPage;


public class TestAutomatedQaSection extends TestBase {
  MainPage mainPage = new MainPage();
  AutomatedQaSectionPage automatedQaSectionPage = new AutomatedQaSectionPage();

  String service = "Услуги";
  String section = "Тестирование";
  String subsection = "Автотестирование";
  String textValue = "Помогаем сократить трудозатраты";

  @Test
  @Tag("remote")
  @Owner("Kristina Gaevskaya")
  @Epic("Учёба")
  @Story("Дипломный проект")
  @DisplayName("Проверка отображения информации в секции 'Автотестирование'")
  @Severity(SeverityLevel.CRITICAL)
  void AutomatedQaSectionPageTest() {
    mainPage.openPage()
            .sectionMouseOn(service);
    automatedQaSectionPage.servicesDisplayOn(section)
            .searchSubsection(subsection)
            .shouldHaveText(textValue);
  }
}
