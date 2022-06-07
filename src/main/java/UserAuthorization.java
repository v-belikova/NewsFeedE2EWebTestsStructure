import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class UserAuthorization {
    String homePageURL = "https://news-feed-2.dunice-testing.com/";

    SelenideElement emailInput = Selenide.$(By.name("email"));
    SelenideElement passwordInput = Selenide.$(By.name("password"));

}
