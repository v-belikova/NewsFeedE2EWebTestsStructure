import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationUserPage {

    String homePageURL = "https://news-feed-2.dunice-testing.com/";


    SelenideElement regTitle = $(By.cssSelector(".modal-content"));
    SelenideElement emailInput = Selenide.$(By.name("emailReg"));
    SelenideElement loginInput = Selenide.$(By.name("loginReg"));
    SelenideElement passwordInput = Selenide.$(By.name("passwordReg"));
    SelenideElement avatarInput = Selenide.$(By.name("avatar"));
    SelenideElement buttonSave = Selenide.$x("*//button[contains(text(),'Save')]");

}



















