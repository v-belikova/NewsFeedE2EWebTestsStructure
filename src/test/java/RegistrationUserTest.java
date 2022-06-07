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

public class RegistrationUserTest extends SetUp {

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
        methods.registrationUser();
        // delete user
        //methods.deleteUser();
    }
}






