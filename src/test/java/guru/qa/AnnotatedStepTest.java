package guru.qa;

import org.junit.jupiter.api.Test;

public class AnnotatedStepTest {

    private static final String REPOSITORY = "SergeyUlyanovAQA/allure_reports";

    private WebSteps steps = new WebSteps();

    @Test
    public void shouldSeeIssuesInRepository() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.shouldTextIssues();
    }
}
