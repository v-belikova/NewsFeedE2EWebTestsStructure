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

public class UpdateUserProfileTest extends SetUp {

    private final UpdateUserProfile updateUserProfile = new UpdateUserProfile();
    private final Methods methods = new Methods();
    private final HeaderElements headerElements = new HeaderElements();


    @Epic(value = "Login page.")
    @Feature("Login.")
    @Story("Valid Login.")
    @Description(value = "Check sign in with email and password.")


    @Test
    public void infoUserPositiveTest() throws InterruptedException  {
        open(updateUserProfile.homePageURL);
        // info
        headerElements.emailInput.setValue("mustyacyvc12@mail.ru");
        headerElements.passwordInput.setValue("0000001");
        headerElements.buttonLogIn.shouldBe(Condition.visible).click();
        headerElements.helloHeader.shouldHave(text("Hello,"), text("mustyacyvc12"));
        updateUserProfile.stringMyProfile.shouldBe(Condition.visible).click();
        updateUserProfile.updateUser.shouldBe(Condition.visible).click();
        updateUserProfile.emailNew.setValue("losk@mail.ru");
        updateUserProfile.loginNew.setValue("losk");
        String avatar2 = "src/main/resources/avatar2.jpeg";
        File file = new File(new File(avatar2).getAbsolutePath());
        updateUserProfile.avatarInputNew.shouldBe(Condition.visible).uploadFile(file);
        updateUserProfile.buttonSave.shouldBe(Condition.visible).click();
        headerElements.helloHeader.shouldHave(text("Hello,"), text("losk"));

        Thread.sleep(6000);


    }
}


