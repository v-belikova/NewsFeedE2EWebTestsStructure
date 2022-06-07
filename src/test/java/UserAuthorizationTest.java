import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.codeborne.selenide.Selenide.open;

public class UserAuthorizationTest extends SetUp {

    private final UserAuthorization userAuthorization = new UserAuthorization();
    private final Methods methods = new Methods();
    private final HeaderElements headerElements = new HeaderElements();


    @Epic(value = "Login page.")
    @Feature("Login.")
    @Story("Valid Login.")
    @Description(value = "Check sign in with email and password.")

    @Test
    public void authorizationPositiveTest() throws InterruptedException {
        open(userAuthorization.homePageURL);
        // authorization
        userAuthorization.getEmailInput().setValue("mustyacyvc12@mail.ru");
        userAuthorization.getPasswordInput().setValue("0000001");
        headerElements.buttonLogIn.shouldBe(Condition.visible).click();
        headerElements.helloHeader.shouldHave(text("Hello,"), text("mustyacyvc12"));
        Thread.sleep(6000);
    }
}
