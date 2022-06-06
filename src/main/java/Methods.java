import com.codeborne.selenide.Condition;

import java.io.File;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Methods {

    private final LoginPage loginPage = new LoginPage();
    private final HeaderElements headerElements = new HeaderElements();
    private final AccountPage accountPage = new AccountPage();

    // random string generation
    public static String generateRandomHexString (int length){
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        while(sb.length() < length){
            sb.append(Integer.toHexString(r.nextInt()));
        }
        return sb.toString().substring(0, length);
    }

    public void deleteUser() {
        headerElements.accountCircleButton.shouldBe(Condition.visible).click();
        accountPage.deleteUser.shouldBe(Condition.visible).click();
    }
}
