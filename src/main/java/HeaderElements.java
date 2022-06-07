import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderElements {

    SelenideElement buttonSign = Selenide.$x("*//button[contains(text(),'Sign Up')]");
    SelenideElement helloHeader = $(By.cssSelector(".Header_header__greetings__3WI4_"));
    SelenideElement buttonLogIn = Selenide.$x("*//button[contains(text(),'Log In')]");

    SelenideElement quitSingOut = Selenide.$x("*//button[contains(text(),'Sing Out')]");



}
