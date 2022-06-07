import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MyProfilePage {
    SelenideElement updateUser = Selenide.$x("*//button[contains(text(),'Update')]");
    SelenideElement deleteUser = Selenide.$x("*//button[contains(text(),'Delete profile')]");
    SelenideElement newPost = Selenide.$x("*//button[contains(text(),'New Post')]");
}
