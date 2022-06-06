import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.codeborne.selenide.Selenide.open;

public class UserInfoTest extends SetUp {

    private final UserInfo  userInfo = new UserInfo();
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
        userInfo.emailInput.setValue("mustyacyvc12@mail.ru");
        userInfo.passwordInput.setValue("0000001");
        userInfo.buttonLogIn.shouldBe(Condition.visible).click();
        headerElements.helloHeader.shouldHave(text("Hello,"), text ("mustyacyvc12"));
        userInfo.stringMyProfile.shouldBe(Condition.visible).click();;
        Thread.sleep(6000);

    }
}

