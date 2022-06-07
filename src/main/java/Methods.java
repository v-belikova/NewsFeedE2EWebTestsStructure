import com.codeborne.selenide.Condition;

import java.io.File;
import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Methods {

    private static final RegistrationUserPage registrationUserPage = new RegistrationUserPage();
    private static final HeaderElements headerElements = new HeaderElements();
    private static final UserAuthorization userAuthorization = new UserAuthorization();
    private final MyProfilePage accountPage = new MyProfilePage();

    // random string generation
    public static String generateRandomHexString(int length) {
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        while (sb.length() < length) {
            sb.append(Integer.toHexString(r.nextInt()));
        }
        return sb.toString().substring(0, length);
    }

    /* public void deleteUser() {
         headerElements.accountCircleButton.shouldBe(Condition.visible).click();
         accountPage.deleteUser.shouldBe(Condition.visible).click();
     }*/
    public void registrationUser() throws InterruptedException {
        open(registrationUserPage.homePageURL);

        // registration
        headerElements.buttonSign.shouldBe(Condition.visible).click();
        registrationUserPage.regTitle.shouldBe(Condition.visible);
        registrationUserPage.emailInput.sendKeys(generateRandomHexString(5) + "@gmail.com");
        String emailText = registrationUserPage.emailInput.getAttribute("value");
        registrationUserPage.loginInput.sendKeys(generateRandomHexString(5));
        String loginText = registrationUserPage.loginInput.getAttribute("value");
        registrationUserPage.passwordInput.sendKeys(generateRandomHexString(6));
        String passwordText = registrationUserPage.passwordInput.getAttribute("value");
        String avatar = "src/main/resources/avatar.jpeg";
        File file = new File(new File(avatar).getAbsolutePath());
        registrationUserPage.avatarInput.shouldBe(Condition.visible).uploadFile(file);
        registrationUserPage.buttonSave.shouldBe(Condition.visible).click();
        headerElements.helloHeader.shouldBe(Condition.visible);
        Thread.sleep(6000);
        //assertEquals(("Hello, " + loginText), headerElements.helloHeader.getText());

    }

    public void authorizationUser() throws InterruptedException {
        open(userAuthorization.homePageURL);

        // authorization
        userAuthorization.emailInput.setValue("mustyacyvc12@mail.ru");
        userAuthorization.passwordInput.setValue("0000001");
        headerElements.buttonLogIn.shouldBe(Condition.visible).click();
        headerElements.helloHeader.shouldHave(text("Hello,"), text("mustyacyvc12"));
        Thread.sleep(6000);
    }
}

