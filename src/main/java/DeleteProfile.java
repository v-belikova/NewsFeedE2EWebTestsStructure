import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class DeleteProfile {
    SelenideElement deleteUser = Selenide.$x("*//button[contains(text(),'Delete profile')]");
}
