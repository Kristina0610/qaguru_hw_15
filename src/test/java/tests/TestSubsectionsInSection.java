package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.components.MainPage;
import pages.components.SubsectionsInSectionPage;


public class TestSubsectionsInSection extends TestBase {
  MainPage mainPage = new MainPage();
  SubsectionsInSectionPage subsectionsInSectionPage = new SubsectionsInSectionPage();

  String sectionSolutions = "Решения";
  String sectionServices = "Услуги";
  String sectionCompany = "Компания";

  String[][] subsectionSolutions = {{"\"/capitalmarkets\"", "Системы трейдинга"},
          {"\"/risks\"", "Управление рисками"},
          {"\"/brokerage\"", "Брокерский бизнес"},
          {"\"/treasury\"", "Казначейство"},
          {"\"/loan\"", "Кредитный конвейер"}};

  String[][] subsectionServices = {{"\"/outsource-outstaff-it-specialistov\"", "Аутстаффинг"},
          {"\"/automatedqa\"", "Тестирование"},
          {"\"/development\"", "Разработка"},
          {"\"/processes\"", "Аналитика"}};

  String[][] subsectionCompany = {{"\"/contact-us\"", "Контакты"},
          {"\"/company\"", "Компания"}};

  @Test
  @Tag("remote")
  @Owner("Kristina Gaevskaya")
  @Epic("Учёба")
  @Story("Дипломный проект")
  @DisplayName("Проверка отображения подразделов в секции 'Решения'")
  @Severity(SeverityLevel.CRITICAL)
  void SubsectionsInSectionSolutionsTest() {
    mainPage.openPage()
            .sectionMouseOn(sectionSolutions);
    subsectionsInSectionPage.listDisplayOn(sectionSolutions);

    for (int i = 0; i < subsectionSolutions.length; i++) {
      subsectionsInSectionPage.shouldHaveText(subsectionSolutions[i][0], subsectionSolutions[i][1]);
    }
  }

  @Test
  @Tag("remote")
  @Owner("Kristina Gaevskaya")
  @Epic("Учёба")
  @Story("Дипломный проект")
  @DisplayName("Проверка отображения подразделов в секции 'Услуги'")
  @Severity(SeverityLevel.CRITICAL)
  void SubsectionsInSectionServicesTest() {
    mainPage.openPage()
            .sectionMouseOn(sectionServices);

    for (int i = 0; i < subsectionServices.length; i++) {
      subsectionsInSectionPage.shouldHaveText(subsectionServices[i][0], subsectionServices[i][1]);
    }
  }

  @Test
  @Tag("remote")
  @Owner("Kristina Gaevskaya")
  @Epic("Учёба")
  @Story("Дипломный проект")
  @DisplayName("Проверка отображения подразделов в секции 'Компания'")
  @Severity(SeverityLevel.CRITICAL)
  void SubsectionsInSectionCompanyTest() {
    mainPage.openPage()
            .sectionMouseOn(sectionCompany);

    for (int i = 0; i < subsectionCompany.length; i++) {
      subsectionsInSectionPage.shouldHaveText(subsectionCompany[i][0], subsectionCompany[i][1]);
    }
  }

}
