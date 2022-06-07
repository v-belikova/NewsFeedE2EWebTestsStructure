import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationUserTest extends SetUp {    String homePageURL = "https://news-feed-2.dunice-testing.com/";

    private final RegistrationUserPage registrationUserPage = new RegistrationUserPage();
    private final Methods methods = new Methods();
    private final HeaderElements headerElements = new HeaderElements();

    @Epic(value = "Login page.")
    @Feature("Login.")
    @Story("Valid Login.")
    @Description(value = "Check sign in with email and password.")


    @Test
    public void regressionPositiveTest() throws InterruptedException {
        //registration
        open(registrationUserPage.homePageURL);

        // registration
        registrationUserPage.getButtonSign().shouldBe(Condition.visible).click();
        registrationUserPage.getRegTitle().shouldBe(Condition.visible);
        registrationUserPage.getEmailInput().sendKeys(methods.generateRandomHexString(5) + "@gmail.com");
        String emailText = registrationUserPage.getEmailInput().getAttribute("value");
        registrationUserPage.getLoginInput().sendKeys(methods.generateRandomHexString(5));
        String loginText = registrationUserPage.getLoginInput().getAttribute("value");
        registrationUserPage.getPasswordInput().sendKeys(methods.generateRandomHexString(6));
        String passwordText = registrationUserPage.getPasswordInput().getAttribute("value");
        String avatar = "src/main/resources/avatar.jpeg";
        File file = new File(new File(avatar).getAbsolutePath());
        registrationUserPage.getAvatarInput().shouldBe(Condition.visible).uploadFile(file);
        registrationUserPage.getButtonSave().shouldBe(Condition.visible).click();
        headerElements.helloHeader.shouldBe(Condition.visible);
        Thread.sleep(6000);
        //assertEquals(("Hello, " + loginText), headerElements.helloHeader.getText());

        // delete user
        //methods.deleteUser();
    }
}






