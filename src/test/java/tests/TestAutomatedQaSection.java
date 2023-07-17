package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.components.AutomatedQaSectionPage;
import pages.components.MainPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TestAutomatedQaSection extends TestBase {
  MainPage mainPage = new MainPage();
  AutomatedQaSectionPage automatedQaSectionPage = new AutomatedQaSectionPage();

  String service = "Услуги";
  String section = "Тестирование";

  @Test
  @Tag("remote")
  @Owner("Kristina Gaevskaya")
  @Epic("Учёба")
  @Story("Дипломный проект")
  @DisplayName("Проверка отображения информации в секции 'Автотестирование'")
  @Severity(SeverityLevel.CRITICAL)
  void AutomatedQaSectionPageTest() {
    mainPage.openPage()
            .sectionClick(service);
    automatedQaSectionPage.servicesDisplayOn(section);
  }

  @Test
  void traineeTest() {
    mainPage.openPage();
    $("[role = menubar]").$(byText("Услуги")).hover();
    $("[href=\"/automatedqa\"]").shouldBe(visible);
    $(byText("Тестирование")).click();
    $("#tab2_550987857").shouldHave(text("Автотестирование")).click();
    //$("div.tn-atom").shouldHave(innerText("Рассчитать стоимость автоматизации;"));
    //$("div.t396").scrollIntoView(true);
    $("div #rec551026942").scrollIntoView(false);
    //$("div #rec550988040 > [data-elem-id=\"1676430365188\"] > [field=\"tn_text_1676430365188\"]").shouldHave(text("Помогаем сократить трудозатраты в условиях быстро растущей регрессионной модели и увеличения тестового покрытия продукта."));
    $("div #rec550988040").shouldHave(text("Помогаем сократить трудозатраты в условиях быстро растущей регрессионной модели и увеличения тестового покрытия продукта."));
  }
}
