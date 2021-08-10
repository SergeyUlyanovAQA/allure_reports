package guru.qa;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebSteps {

    @Step ("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com");

    }
    @Step ("Ищем репозиторий [{repository}]")
    public void searchForRepository(String repository) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").submit();

    }
    @Step ("Переходим на страницу репозитория [{repository}]")
    public void goToRepository(String repository) {
        $(linkText("SergeyUlyanovAQA/allure_reports")).click();

    }
    @Step ("Проверяем на странице наличие Issues")
    public void shouldTextIssues() {
        $(byText("Issues")).should(Condition.exist);

    }
}
