package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.components.MainPage;
import pages.components.VacanciesPage;


public class TestVacancies extends TestBase {
  MainPage mainPage = new MainPage();
  VacanciesPage vacanciesPage = new VacanciesPage();

  String sectionVacancies = "Карьера",
          listOfVacancies = "Список доступных вакансий",
          text = "Вакансии EGAR Technology";


  @Test
  @Tag("remote")
  @Owner("Kristina Gaevskaya")
  @Epic("Учёба")
  @Story("Дипломный проект")
  @DisplayName("Проверка перехода на страницу 'Список вакансий'")
  @Severity(SeverityLevel.CRITICAL)
  void vacancyTest() {
    mainPage.openPage();
    vacanciesPage.servicesDisplayOn(sectionVacancies)
            .listOfVacanсies(listOfVacancies)
            .shouldHaveText(text);

  }


}
