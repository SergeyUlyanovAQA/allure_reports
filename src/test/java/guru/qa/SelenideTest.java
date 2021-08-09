package guru.qa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class SelenideTest {

    @Test
    public void testRepositoryIssue() {

        open("https://github.com");

        $(".header-search-input").click();
        $(".header-search-input").sendKeys("SergeyUlyanovAQA/allure_reports");
        $(".header-search-input").submit();
        $(linkText("SergeyUlyanovAQA/allure_reports")).click();
        $(byText("Issues")).should(Condition.exist);

    }
}
