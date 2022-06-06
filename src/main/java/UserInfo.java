import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserInfo {

    String homePageURL = "https://news-feed-2.dunice-testing.com/";

    SelenideElement emailInput = Selenide.$(By.name("email"));
    SelenideElement passwordInput = Selenide.$(By.name("password"));
    SelenideElement buttonLogIn = Selenide.$x("*//button[contains(text(),'Log In')]");
    SelenideElement stringMyProfile = Selenide.$(By.cssSelector(".Nav_navigation__item__3eTUx Nav_active__XSt-p"));
}
