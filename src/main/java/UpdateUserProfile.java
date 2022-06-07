import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class UpdateUserProfile {
    String homePageURL = "https://news-feed-2.dunice-testing.com/";
    SelenideElement stringMyProfile = Selenide.$x("*//a[contains(text(),'My profile')]");
    SelenideElement updateUser = Selenide.$x("*//button[contains(text(),'Update')]");
    SelenideElement emailNew = Selenide.$(By.name("email"));
    SelenideElement loginNew = Selenide.$(By.name("name"));
    SelenideElement avatarInputNew = Selenide.$(By.name("avatar"));
    SelenideElement buttonSave = Selenide.$x("*//button[contains(text(),'Save')]");

}
