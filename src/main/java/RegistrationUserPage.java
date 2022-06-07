import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationUserPage {

    String homePageURL = "https://news-feed-2.dunice-testing.com/";

    private SelenideElement regTitle = $(By.cssSelector(".modal-content"));
    private SelenideElement buttonSign = Selenide.$x("*//button[contains(text(),'Sign Up')]");
    private SelenideElement emailInput = Selenide.$(By.name("emailReg"));
    private SelenideElement loginInput = Selenide.$(By.name("loginReg"));
    private SelenideElement passwordInput = Selenide.$(By.name("passwordReg"));
    private SelenideElement avatarInput = Selenide.$(By.name("avatar"));
    private SelenideElement buttonSave = Selenide.$x("*//button[contains(text(),'Save')]");

    public SelenideElement getEmailInput() {
        return emailInput;
    }

    public SelenideElement getLoginInput() {
        return loginInput;
    }

    public SelenideElement getPasswordInput() {
        return passwordInput;
    }

    public SelenideElement getAvatarInput() {
        return avatarInput;
    }

    public SelenideElement getButtonSave() {
        return buttonSave;
    }

    public SelenideElement getButtonSign() {
        return buttonSign;
    }

    public SelenideElement getRegTitle(){
        return regTitle;
    }

    public void registration(){
        buttonSign.click();

        buttonSave.click();
    }




}






















