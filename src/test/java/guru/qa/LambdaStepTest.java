package guru.qa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class LambdaStepTest {

    private static final String REPOSITORY = "SergeyUlyanovAQA/allure_reports";

    @Test
    public void testRepositoryIssue() {

        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });

        step("Ищем репозиторий" + REPOSITORY, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPOSITORY);
            $(".header-search-input").submit();
        });

        step("Переходим на страницу репозитория" + REPOSITORY, () -> {
            $(linkText("SergeyUlyanovAQA/allure_reports")).click();
        });

        step("Проверяем на странице наличие Issue", () -> {
            $(byText("Issues")).should(Condition.exist);
        });


    }
}
