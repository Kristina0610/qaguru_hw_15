package tests;


import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.components.MainPage;


public class TestMainPage extends TestBase {

  MainPage mainPage = new MainPage();

  String[] services = {"Решения", "Услуги", "Платформа NCW", "Карьера", "Новости", "Компания"};
  @Test
  @Tag("remote")
  @Owner("Kristina Gaevskaya")
  @Epic("Учёба")
  @Story("Дипломный проект")
  @DisplayName("Проверка отображения основные разделов на странице")
  @Severity(SeverityLevel.CRITICAL)
  void mainPageTest() {
    mainPage.openPage();
    for (int i = 0; i < services.length; i++) {
      mainPage.servicesDisplayOn(services[i]);
    }
  }
}
