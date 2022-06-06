import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    String homePageURL = "https://news-feed-2.dunice-testing.com/";

   // SelenideElement authTitle = $(By.cssSelector("#login-form > h1"));
    //SelenideElement regTitle = $(By.cssSelector("#reg-form > h1"));

    SelenideElement buttonSign = Selenide.$x("*//button[contains(text(),'Sign Up')]");
    SelenideElement emailInput = Selenide.$(By.name("emailReg"));
    SelenideElement loginInput = Selenide.$(By.name("loginReg"));
    SelenideElement passwordInput = Selenide.$(By.name("passwordReg"));
    SelenideElement avatarInput = Selenide.$(By.name("avatar"));
    SelenideElement buttonSave = Selenide.$x("*//button[contains(text(),'Save')]");
    //SelenideElement googleAuthButton = $(By.xpath("/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/button[1]/span[1]"));
}




/*public class LoginPage {

    String homePageURL = "https://news-feed.dunice-testing.com/";

    SelenideElement authTitle = $(By.cssSelector("#login-form > h1"));
    SelenideElement regTitle = $(By.cssSelector("#reg-form > h1"));

    // login
    SelenideElement email = $(By.xpath("/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"));
    SelenideElement password = $(By.xpath("/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/form[1]/mat-form-field[2]/div[1]/div[1]/div[1]/input[1]"));
    SelenideElement submitButton = $(By.cssSelector("#login-form__button"));
    SelenideElement googleAuthButton = $(By.xpath("/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/button[1]/span[1]"));
    // registration
    SelenideElement registrationButton = $(By.cssSelector("#login-form__link > span.mat-button-wrapper"));
    SelenideElement loginReg = $(By.xpath("/html[1]/body[1]/app-root[1]/app-registration[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]"));
    SelenideElement emailReg = $(By.xpath("/html[1]/body[1]/app-root[1]/app-registration[1]/form[1]/mat-form-field[2]/div[1]/div[1]/div[1]/input[1]"));
    SelenideElement passwordReg = $(By.xpath("/html[1]/body[1]/app-root[1]/app-registration[1]/form[1]/mat-form-field[3]/div[1]/div[1]/div[1]/input[1]"));
    SelenideElement avatarReg = $(By.cssSelector("#reg-form-avatar__input-file-id"));
    SelenideElement submitRegButton = $(By.xpath("//body/app-root[1]/app-registration[1]/form[1]/button[1]"));



}*/








