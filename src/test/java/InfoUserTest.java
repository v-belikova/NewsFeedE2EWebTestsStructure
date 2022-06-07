import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.codeborne.selenide.Selenide.open;

public class InfoUserTest extends SetUp {

    private final InfoUser userInfo = new InfoUser();
    private final Methods methods = new Methods();
    private final HeaderElements headerElements = new HeaderElements();


    @Epic(value = "Login page.")
    @Feature("Login.")
    @Story("Valid Login.")
    @Description(value = "Check sign in with email and password.")


    @Test
    public void infoUserPositiveTest() throws InterruptedException  {

        open(userInfo.homePageURL);

        // info
        methods.authorizationUser();
        userInfo.stringMyProfile.shouldBe(Condition.visible).click();;
        Thread.sleep(6000);

    }
}

