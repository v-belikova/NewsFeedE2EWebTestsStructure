import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountPage {

    SelenideElement deleteUser = $(By.cssSelector("//*[contains(@text, 'Удалить пользователя')]"));

}
